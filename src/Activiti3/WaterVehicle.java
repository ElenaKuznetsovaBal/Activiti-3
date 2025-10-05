package Activiti3;

public sealed class WaterVehicle extends Transport permits Ship, Boat {
    protected final int length;
    protected final boolean hasSail;

    public WaterVehicle(String brand, String model, int year, Engine engine, int length, boolean hasSail) {
        super(brand, model, year, engine);
        this.length = length;
        this.hasSail = hasSail;
    }

    public void dropAnchor() {
        System.out.println(brand + " " + model + " якорь в воду");
    }

    public int getLength() {
        return length;
    }

    public boolean hasSail() {
        return hasSail;
    }
}
