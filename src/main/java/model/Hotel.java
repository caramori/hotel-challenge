package model;

import model.types.HotelRating;

import java.util.List;

public class Hotel {

    private String name;
    private HotelRating rating;
    private List<HotelPrice> prices;

    public Hotel(String name, HotelRating rating, List<HotelPrice> prices) {
        this.name = name;
        this.rating = rating;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelRating getRating() {
        return rating;
    }

    public void setRating(HotelRating rating) {
        this.rating = rating;
    }

    public List<HotelPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<HotelPrice> prices) {
        this.prices = prices;
    }
}
