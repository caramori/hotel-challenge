package controller;

import database.HotelDataAccess;
import model.Hotel;
import model.HotelPrice;
import model.types.WeekDayType;
import request.CheapestHotelRequest;
import request.CheapestHotelRequestBuilder;
import response.CheapestHotelResponse;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HotelController {

    public String getCheapestHotel(String requestStr){

        CheapestHotelRequest request = new CheapestHotelRequestBuilder(requestStr).getRequest();

        Map<WeekDayType, Long> countDatePerWeekdayType =
                request.getDates().stream().map((date) ->  WeekDayType.fromDate(date) )
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<CheapestHotelResponse> pricesPerHotel = new HotelDataAccess().findAll().stream().map((hotel) -> {

            BigDecimal hotelSum = getTotalPriceForHotel(request, countDatePerWeekdayType, hotel);
            return new CheapestHotelResponse(hotel, hotelSum);

        }).collect(Collectors.toList());

        Collections.sort(pricesPerHotel, (p1, p2)->{
            int comparePrice = p1.getTotalPrice().compareTo(p2.getTotalPrice());
            return comparePrice == 0 ?
                    p2.getHotel().getRating().getStars() - p1.getHotel().getRating().getStars() : comparePrice;
        });

        return pricesPerHotel.get(0).getHotel().getName();
    }

    private BigDecimal getTotalPriceForHotel(CheapestHotelRequest request, Map<WeekDayType, Long> countDatePerWeekdayType, Hotel hotel) {

        BigDecimal hotelSum =

                countDatePerWeekdayType.entrySet().stream().map((entry) -> {

                    HotelPrice hotelPriceForWeekday = hotel.getPrices().stream().filter((price) -> {
                        return price.getCustomerType() == request.getCustomerType() &&
                                price.getWeekday() == entry.getKey();
                    }).findFirst().orElseThrow();

                    return hotelPriceForWeekday.getPrice().multiply(new BigDecimal(entry.getValue()));

                }).reduce(BigDecimal.ZERO, BigDecimal::add);

        return hotelSum;
    }
}
