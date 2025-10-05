package Activiti3;

public class Engine {
    private final int power;
    private final Fuel fuel;
    private boolean isRunning;

    public Engine(int power, Fuel fuel) {
        this.power = power;
        this.fuel = fuel;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Двигатель запустился (" + fuel.getDescription() + ", " + power + " л.с.)");
        }
    }
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Двигатель остановился");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getPower() {
        return power;
    }

    public Fuel getFuel() {
        return fuel;
    }
