package parkingLot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int TOTAL_SPOTS;
    private int occupiedSpot=0;
    List<Vehicle> spots = new ArrayList<>();

    public ParkingLot(int TOTAL_SPOTS ) {
        this.TOTAL_SPOTS=TOTAL_SPOTS;
    }


    public String park(Vehicle vehicle){
        if(isSpotAvailable(vehicle.spotNeeded)){
            spots.add(vehicle);
            setOccupiedSpot(occupiedSpot+=vehicle.spotNeeded);
            return "Vehicle can park";
        }
        return "Vehicle can't park";
    }

    public String unPark(List<Vehicle> vehicles,Vehicle vehicle){
        for (Vehicle vehicleType:vehicles) {
            if (vehicleType==vehicle){
                vehicles.remove(vehicle);
                setOccupiedSpot(occupiedSpot-=vehicle.spotNeeded);
                return vehicleType.licenseNumber +" Vehicle unPark";
            }
        }
        return "Vehicle not in parking";
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
    public List<Vehicle> getSpots() {
        return spots;
    }
}