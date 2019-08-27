import java.util.Arrays;
import java.util.List;

public class Vehicle {
    public int spotNeed;
    public final List<Vehicle>TOTAL_VEHICLE= Arrays.asList();
    public int getSpotNeed() {
        return spotNeed;
    }
    public void add(Vehicle vehicle){
      TOTAL_VEHICLE.add(vehicle);
    }
    public List<Vehicle>getTOTAL_VEHICLE(){
        return TOTAL_VEHICLE;
    }
}
