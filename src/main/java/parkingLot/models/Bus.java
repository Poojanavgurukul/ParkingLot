package parkingLot.models;

public class Bus extends Vehicle {

    public Bus(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        this.spotNeeded = 4;
    }
}
