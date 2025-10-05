package Activiti3;

public sealed class AirVehicle extends Transport permits Airplane, Helicopter {
    protected final int maxAltitude;

    public AirVehicle(String brand, String model, int year, Engine engine, int maxAltitude) {
        super(brand, model, year, engine);
        this.maxAltitude = maxAltitude;
    }

    public void takeOff() {
        System.out.println(brand + " " + model + " взлёт");
    }

    public void land() {
        System.out.println(brand + " " + model + " посадка");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }
}

