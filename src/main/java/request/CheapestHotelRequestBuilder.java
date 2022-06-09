package request;

import model.types.CustomerType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CheapestHotelRequestBuilder {

    private String queryString;
    private CheapestHotelRequest request;

    private static final DateTimeFormatter dateParser = new DateTimeFormatterBuilder()
                                            .parseCaseInsensitive().appendPattern("ddLLLyyyy(eee)")
                                            .toFormatter();

    private static final Pattern replaceLongWeekdays = Pattern.compile("\\(([a-zA-Z]{3})[a-zA-Z]*\\)");

    public CheapestHotelRequestBuilder(String queryString) {
        this.queryString = queryString;
    }

    public CheapestHotelRequest getRequest() {

        this.request = new CheapestHotelRequest();

        setCustomerType();
        setDates();

        return request;
    }

    private void setDates() {

        List<LocalDate> dates =
            Arrays.stream(this.queryString.substring(this.queryString.indexOf(":") + 2)
                    .split(",")).map((dateStr)-> {
                        dateStr = replaceLongerWeekdayNames(dateStr);
                        return LocalDate.parse(dateStr, dateParser);
            }).collect(Collectors.toList());

        this.request.setDates(dates);
    }

    /**
     * 26Mar2009(thur) -> 26Mar2009(thu)
     *
     * @param dateStr
     * @return
     */
    private String replaceLongerWeekdayNames(String dateStr) {
        return replaceLongWeekdays.matcher(dateStr.trim()).replaceAll("($1)");
    }

    private void setCustomerType() {
        String customerTypeStr = this.queryString.substring(0, this.queryString.indexOf(":"));
        request.setCustomerType(CustomerType.valueOf(customerTypeStr.toUpperCase()));
    }
}
