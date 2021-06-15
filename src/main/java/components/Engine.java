package components;

public class Engine {
    private String engineNo;
    private int engineSize;
    private String fuelType;

    public Engine(String engineNo, int engineSize, String fuelType) {
        this.engineNo = engineNo;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }
}
