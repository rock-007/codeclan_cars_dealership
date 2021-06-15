package components;

public enum EngineType {


    TWOLITERPETROL(2, "PETROL"),
    TWOLITERDIESEL(2, "DIESEL"),
    BATTERY1KW(1, "ELECTRIC"),
    BATTERY2KW(2, "ELECTRIC");

    int engineSize;
    String fuelType;

    EngineType(int engineSize, String fuelType) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }
}
