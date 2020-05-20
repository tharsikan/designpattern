public class CarTelescope2 {
    String insurance;
    boolean etc;
    String dropLocation;
    String roadAssistance;

    public CarTelescope2(String insurance,boolean etc,String dropLocation,String roadAssistance){
        this.insurance = insurance;
        this.etc = etc;
        this.dropLocation = dropLocation;
        this.roadAssistance = roadAssistance;
    }
    public CarTelescope2(String insurance,boolean etc,String dropLocation){
        this(insurance,etc,dropLocation,null);
    }
    public CarTelescope2(String insurance,boolean etc){
        this(insurance,etc,null);
    }
    public CarTelescope2(String insurance){
        this(insurance,false,null);
    }

    @Override
    public String toString() {
        return "CarTelescope2{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropLocation='" + dropLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}
