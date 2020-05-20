public class Application {
    public static void main(String[] args) {
        CarTelescope1 car1 = new CarTelescope1("inss");
        System.out.println(car1);
        CarTelescope2 car2 = new CarTelescope2("inss");
        System.out.println(car2);

        Car.Builder builder = new Car.Builder("insr");
        Car car3 = builder.dropLocation("vavuniya").etc(true).build();
        System.out.println(car3);
    }
}
