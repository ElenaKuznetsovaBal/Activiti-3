package Activiti3;

public sealed class LandVehicle extends Transport permits Car, Bicycle {
    protected final int wheelCount;

    public LandVehicle(String brand, String model, int year, Engine engine, int wheelCount) {
        super(brand, model, year, engine);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }
}