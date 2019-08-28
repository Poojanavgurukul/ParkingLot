package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int TOTAL_SPOTS=20;
    private int occupiedSpot=0;

    List<Vehicle> vehicles= new ArrayList<>();

    public String park(Vehicle vehicle){
        if(isSpotAvailable(vehicle.size)){
            vehicles.add(vehicle);
            setOccupiedSpot(occupiedSpot+=vehicle.size);
            return "Vehicle can park";
        }
        return "Vehicle can't park";
    }

    public boolean isSpotAvailable(int spotNeeded){
        int vacantSpot=TOTAL_SPOTS-getOccupiedSpot();
        if (vacantSpot>=spotNeeded){
            return true;
        }
        return false;
    }
    public int getOccupiedSpot() {
        return occupiedSpot;
    }
    public void setOccupiedSpot(int occupiedSpot) {
        this.occupiedSpot = occupiedSpot;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
