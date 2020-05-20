public class Application {
    public static void main(String[] args) {
        Registory registory = new Registory();
        Car car1 = (Car) registory.getVehicle(VehicleType.CAR);
        System.out.println(car1);
        car1.setType("luxury");
        System.out.println(car1);
        Car car2 = (Car) registory.getVehicle(VehicleType.CAR);
        System.out.println(car2);
        Bus bus1 = (Bus) registory.getVehicle(VehicleType.BUS);
        System.out.println(bus1);
        bus1.setNumberOfSeats(44);
        System.out.println(bus1);
        Bus bus2 = (Bus) registory.getVehicle(VehicleType.BUS);
        System.out.println(bus2);
        System.out.println(bus2.getEngineCapacity());
    }
}
