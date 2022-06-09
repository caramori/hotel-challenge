package request;

import model.types.CustomerType;

import java.time.LocalDate;
import java.util.List;

public class CheapestHotelRequest {

    private CustomerType customerType;
    private List<LocalDate> dates;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }
}
