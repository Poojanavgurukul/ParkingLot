package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int TOTAL_SPOTS=20;
    private int occupiedSpot=0;
    List<Spot> spots = new ArrayList<>(20);
    Spot spot=new Spot();
    public String park(Spot spot,Vehicle vehicle){
        if(spot.isOccupied(vehicle,vehicle.size)){
            spots.add(spot);
            setOccupiedSpot(occupiedSpot+=vehicle.size);
            return "Vehicle can park";
        }
        return "Vehicle can't park";
    }

    public String unPark(List<Vehicle> vehicles, Vehicle vehicle){
        for (Vehicle vehicleType:vehicles) {
            if (vehicleType==vehicle){
                vehicles.remove(vehicle);
                setOccupiedSpot(occupiedSpot-=vehicle.size);
                return vehicleType.licenseNumber +" Vehicle unPark";
            }
        }
        return "Vehicle not in parking";
    }
    /*public boolean isSpotAvailable(int spotNeeded){
            int vacantSpot=TOTAL_SPOTS-getOccupiedSpot();
        if (vacantSpot>=spotNeeded){
            return true;
        }
        return false;
    }*/
    public int getOccupiedSpot() {
        return occupiedSpot;
    }
    public void setOccupiedSpot(int occupiedSpot) {
        this.occupiedSpot = occupiedSpot;
    }
    public List<Spot> getSpots() {
        return spots;
    }
}
