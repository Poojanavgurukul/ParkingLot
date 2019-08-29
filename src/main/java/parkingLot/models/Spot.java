package parkingLot.models;

public class Spot {
    private int current;

    private boolean occupied = false;

    public boolean isOccupied(Vehicle vehicle) {
        current = -vehicle.spotNeeded;
        if (current <= 0) {
            return true;
        }
        return false;
    }
}
