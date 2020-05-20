public class CarTelescope1 {
    String insurance;
    boolean etc;
    String dropLocation;
    String roadAssistance;


    public CarTelescope1(String insurance){
        this.insurance = insurance;
    }
    public CarTelescope1(String insurance,boolean etc){
        this(insurance);
        this.etc = etc;
    }
    public CarTelescope1(String insurance,boolean etc,String dropLocation){
        this(insurance,etc);
        this.dropLocation = dropLocation;
    }
    public CarTelescope1(String insurance,boolean etc,String dropLocation,String roadAssistance){
        this(insurance,etc,dropLocation);
        this.roadAssistance = roadAssistance;
    }

    @Override
    public String toString() {
        return "CarTelescope1{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropLocation='" + dropLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}
