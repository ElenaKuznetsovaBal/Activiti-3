package Activiti3;

package Activiti3;

public sealed class Transport extends Vehicle permits LandVehicle, AirVehicle, WaterVehicle {

    public Transport(String brand, String model, int year, Engine engine) {
        super(brand, model, year, engine);
    }

    @Override
    public void startEngine() {
        if (engine != null) {
            engine.start();
        }
    }

    @Override
    public void stopEngine() {
        if (engine != null) {
            engine.stop();
        }
    }
    @Override
    public void getInfo() {
        System.out.println("Транспортное средство: " + brand + " " + model);
    }
}
