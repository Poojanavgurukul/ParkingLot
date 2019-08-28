package parkingLot;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void vehicleShouldPark() {
        Car car = new Car("xyz12");
        String expected = "Vehicle can park";
        Spot spot=new Spot();
        ParkingLot parkingLot = new ParkingLot();
        String actual = parkingLot.park(spot,car);
        assertEquals(expected, actual);
    }

    @Test
    public void vehicleShouldUnPark() {
        Car car = new Car("xyz12");
        Bike bike = new Bike("xas14");
        String expected = "xas14 Vehicle unPark";
        ParkingLot parkingLot = new ParkingLot();
        Spot spot=new Spot();
        parkingLot.park(spot,car);
        parkingLot.park(spot,bike);
        String actual = parkingLot.unPark(parkingLot.getSpots(), bike);
        assertEquals(expected, actual);
    }

    @Test
    public void parkingLotShouldUnParkOtherVehicle() {
        Car car = new Car("xyz12");
        Bike bike = new Bike("xas14");
        String expected = "Vehicle not in parking";
        ParkingLot parkingLot = new ParkingLot();
        Spot spot=new Spot();
        parkingLot.park(spot,car);
        String actual = parkingLot.unPark(parkingLot.getSpots(), bike);
        assertEquals(expected, actual);
    }
}
