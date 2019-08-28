package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingLotTest {
    @Test
    public void vehicleShouldPark() {
        Car car=new Car("xyz12");
        String expected = "Vehicle can park";
        ParkingLot parkingLot=new ParkingLot();
        String actual=parkingLot.park(car);
        assertEquals(expected,actual);
    }
}
