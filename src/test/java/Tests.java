import controller.HotelController;
import model.types.CustomerType;
import org.junit.jupiter.api.Test;
import request.CheapestHotelRequest;
import request.CheapestHotelRequestBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testLakewood(){
        String cheapestHotel = new HotelController()
                .getCheapestHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");
        assertTrue(cheapestHotel.equalsIgnoreCase("Lakewood"));
    }

    @Test
    public void testBridgewood(){
        String cheapestHotel = new HotelController()
                .getCheapestHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
        assertTrue(cheapestHotel.equalsIgnoreCase("Bridgewood"));
    }

    @Test
    public void testRidgewood(){
        String cheapestHotel = new HotelController()
                .getCheapestHotel("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
        assertTrue(cheapestHotel.equalsIgnoreCase("Ridgewood"));
    }

    @Test
    public void testRequestBuilder(){

        CheapestHotelRequest request =
            new CheapestHotelRequestBuilder("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)")
                    .getRequest();

        assertTrue(request.getCustomerType() == CustomerType.REWARDS);
        assertTrue(request.getDates().size() == 3);
    }
}