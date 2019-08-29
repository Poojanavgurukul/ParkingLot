package parkingLot.models;

public class Bike extends Vehicle {
    public Bike(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        this.spotNeeded = 1;
    }
}
