public class Car {
    private final String insurance;
    private final boolean etc;
    private final String dropLocation;
    private final String roadAssistance;

    public Car(Builder builder){
        this.insurance = builder.insurance;
        this.etc = builder.etc;
        this.dropLocation = builder.dropLocation;
        this.roadAssistance = builder.roadAssistance;
    }

    static class Builder{
        private String insurance;
        private boolean etc;
        private String dropLocation;
        private String roadAssistance;

        public Car build(){
            return new Car(this);
        }

        Builder(String insurance){
            this.insurance = insurance;
        }
        public Builder etc(boolean etc){
            this.etc = etc;
            return this;
        }
        public Builder dropLocation(String dropLocation){
            this.dropLocation = dropLocation;
            return this;
        }
        public Builder roadAssistance(String roadAssistance){
            this.roadAssistance = roadAssistance;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", dropLocation='" + dropLocation + '\'' +
                ", roadAssistance='" + roadAssistance + '\'' +
                '}';
    }
}
