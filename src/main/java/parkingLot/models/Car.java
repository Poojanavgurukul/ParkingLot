package parkingLot.models;

public class Car extends Vehicle {
    public Car(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        this.spotNeeded = 2;
    }
}
