package response;

import model.Hotel;

import java.math.BigDecimal;

public class CheapestHotelResponse {

    private Hotel hotel;
    private BigDecimal totalPrice;

    public CheapestHotelResponse(Hotel hotel, BigDecimal totalPrice) {
        this.hotel = hotel;
        this.totalPrice = totalPrice;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
