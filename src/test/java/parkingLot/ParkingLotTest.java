package parkingLot;

import org.junit.Test;
import parkingLot.models.Bike;
import parkingLot.models.Bus;
import parkingLot.models.Car;
import parkingLot.models.ParkingLot;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void vehicleShouldPark() {
        Car car = new Car("xyz12");
        String expected = "Vehicle can park";
        ParkingLot parkingLot = new ParkingLot(20);
        String actual = parkingLot.park(car);
        assertEquals(expected, actual);
    }

    @Test
    public void vehicleShouldUnPark() {
        Car car = new Car("xyz12");
        Bike bike = new Bike("xas14");
        String expected = "xas14 Vehicle unPark";
        ParkingLot parkingLot = new ParkingLot(20);
        parkingLot.park(car);
        parkingLot.park(bike);
        String actual = parkingLot.unPark(parkingLot.getSpots(), bike);
        assertEquals(expected, actual);
    }

    @Test
    public void parkingLotShouldUnParkOtherVehicle() {
        Car car = new Car("xyz12");
        Bike bike = new Bike("xas14");
        String expected = "Vehicle not in parking";
        ParkingLot parkingLot = new ParkingLot(20);
        parkingLot.park(car);
        String actual = parkingLot.unPark(parkingLot.getSpots(), bike);
        assertEquals(expected, actual);
    }

    @Test
    public void noSpotAvailableInParking() {
        Car car = new Car("xyz12");
        Car car1 = new Car("xas14");
        Bus bus = new Bus("we223");
        Bus bus1 = new Bus("as241");
        Bus bus2 = new Bus("vb261");
        Bus bus3 = new Bus("gj189");
        ParkingLot parkingLot = new ParkingLot(20);
        parkingLot.park(car);
        parkingLot.park(car1);
        parkingLot.park(bus);
        parkingLot.park(bus1);
        parkingLot.park(bus2);
        parkingLot.park(bus3);
        assertFalse("noSpot Available In Parking", parkingLot.isSpotAvailable(parkingLot.getOccupiedSpot()));
    }
}
