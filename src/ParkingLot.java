import java.util.Arrays;
import java.util.List;

public class ParkingLot {
    private final int TOTAL_SPOTS=20;
    private int occupiedSpot=0;
    List<Vehicle>totalVehicle= Arrays.asList();

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
        this.occupiedSpot += occupiedSpot;
    }
}
