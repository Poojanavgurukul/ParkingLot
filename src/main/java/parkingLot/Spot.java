package parkingLot;

public class Spot {
    private int current;
    public boolean isOccupied(Vehicle vehicle,int number){
        current=number-vehicle.size;
        if (current==0){
            return true;
        }
        return false;
    }
}
