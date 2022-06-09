package model;

import model.types.CustomerType;
import model.types.WeekDayType;

import java.math.BigDecimal;

public class HotelPrice {

    private WeekDayType weekday;
    private CustomerType customerType;
    private BigDecimal price;

    public HotelPrice(WeekDayType weekday, CustomerType customerType, BigDecimal price) {
        this.weekday = weekday;
        this.customerType = customerType;
        this.price = price;
    }

    public WeekDayType getWeekday() {
        return weekday;
    }

    public void setWeekday(WeekDayType weekday) {
        this.weekday = weekday;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
