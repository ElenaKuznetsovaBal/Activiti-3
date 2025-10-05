package Activiti3;

public abstract class Vehicle {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected Engine engine;

    public Vehicle(String brand, String model, int year, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void getInfo();

    public void move() {
        System.out.println(brand + " " + model + " начинает движение");
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public Engine getEngine() { return engine; }
}
