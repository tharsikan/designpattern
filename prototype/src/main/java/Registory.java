import java.util.HashMap;
import java.util.Map;

public class Registory {
    private Map<VehicleType,Vehicle> vehicles= new HashMap<>();

    Registory(){
        this.initialize();
    }

    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
            vehicle =(Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }       // when get Vehicle i'm not gonna use new keyword

    public void initialize(){
        Car car = new Car();
        car.setType("Mini");
        car.setEngineCapacity(320);
        car.setFuelType("Gasoline");

        Bus bus = new Bus();
        bus.setNumberOfSeats(24);
        bus.setEngineCapacity(230);
        bus.setFuelType("Diesel");

        vehicles.put(VehicleType.BUS,bus);
        vehicles.put(VehicleType.CAR,car);
    }
}
