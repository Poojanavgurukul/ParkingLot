package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingLotTest {
    @Test
    public void vehicleShouldPark() {
        Car car = new Car("xyz12");
        String expected = "Vehicle can park";
        ParkingLot parkingLot = new ParkingLot();
        String actual = parkingLot.park(car);
        assertEquals(expected, actual);
    }

    @Test
    public void vehicleShouldUnPark() {
        Car car = new Car("xyz12");
        Bike bike = new Bike("xas14");
        String expected = "xas14 Vehicle unPark";
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(car);
        parkingLot.park(bike);
        String actual = parkingLot.unPark(parkingLot.getVehicles(), bike);
        assertEquals(expected, actual);
    }
}
