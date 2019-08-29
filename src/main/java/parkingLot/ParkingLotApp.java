package parkingLot;

import parkingLot.models.*;

public class ParkingLotApp {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(20);

        Bike bike1 = new Bike("1");
        System.out.println(parkingLot.park(bike1));

        Bus bus = new Bus("2");
        System.out.println(parkingLot.park(bus));

        Bus bus1 = new Bus("4");
        System.out.println(parkingLot.park(bus1));

        Bus bus2 = new Bus("5");
        System.out.println(parkingLot.park(bus2));

        Bus bus3 = new Bus("6");
        System.out.println(parkingLot.park(bus3));

        Bike bike2 = new Bike("1");
        System.out.println(parkingLot.park(bike2));

        Bus bus4 = new Bus("6");
        System.out.println(parkingLot.park(bus4));
    }
}
