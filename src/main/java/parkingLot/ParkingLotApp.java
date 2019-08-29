package parkingLot;

import parkingLot.models.*;

public class ParkingLotApp {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(20);

        Bike bike1 = new Bike("1");
        parkingLot.park(bike1);

        Bus bus = new Bus("2");
        parkingLot.park(bus);

        Bike bike2 = new Bike("1");
        parkingLot.park(bike2);
    }
}
