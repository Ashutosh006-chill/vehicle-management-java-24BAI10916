import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Vehicle> vehicleList;

    public FleetManager() {
        vehicleList = new ArrayList<>();
    }

    public void registerVehicle(Vehicle v) {
        vehicleList.add(v);
    }

    public List<Vehicle> fetchAllVehicles() {
        return vehicleList;
    }

    public boolean removeVehicle(Vehicle v) {
        return vehicleList.remove(v);
    }
    
    public int getFleetSize() {
        return vehicleList.size();
    }
}
