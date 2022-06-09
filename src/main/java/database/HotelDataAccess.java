package database;

import model.Hotel;
import model.HotelPrice;
import model.types.CustomerType;
import model.types.HotelRating;
import model.types.WeekDayType;

import java.math.BigDecimal;
import java.util.List;

public class HotelDataAccess {

    public List<Hotel> findAll(){
        return List.of(
                new Hotel("Lakewood", HotelRating.THREE_STARS,
                        List.of(new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REGULAR, new BigDecimal(110)),
                                new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REWARDS, new BigDecimal(80)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REGULAR, new BigDecimal(90)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REWARDS, new BigDecimal(80)))),
                new Hotel("Bridgewood", HotelRating.FOUR_STARS,
                        List.of(new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REGULAR, new BigDecimal(160)),
                                new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REWARDS, new BigDecimal(110)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REGULAR, new BigDecimal(60)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REWARDS, new BigDecimal(50)))),
                new Hotel("Ridgewood", HotelRating.FIVE_STARS,
                        List.of(new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REGULAR, new BigDecimal(220)),
                                new HotelPrice(WeekDayType.WEEKDAY, CustomerType.REWARDS, new BigDecimal(100)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REGULAR, new BigDecimal(150)),
                                new HotelPrice(WeekDayType.WEEKEND, CustomerType.REWARDS, new BigDecimal(40))))
        );
    }
}
