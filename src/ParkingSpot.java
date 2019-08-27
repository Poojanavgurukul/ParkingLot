public class ParkingSpot {
    private boolean occupied;

    public ParkingSpot() {
        occupied = true;
    }

    public boolean isSpotOccupied(int TOTAL_SPOT,int occupiedSpot,Vehicle vehicle){
        int vacantSpot=TOTAL_SPOT-occupiedSpot;
        if (vacantSpot>=vehicle.spotNeed){
            return occupied;
        }
        return !occupied;
    }
}