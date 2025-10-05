package Activiti3;

public final class Car extends LandVehicle {
    private final int doorCount;

    public Car(String brand, String model, int year, Engine engine, int wheelCount, int doorCount) {
        super(brand, model, year, engine, wheelCount);
        this.doorCount = doorCount;
    }

    @Override
    public void getInfo() {
        System.out.println("\n АВТОМОБИЛЬ");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Количество колес: " + wheelCount);
        System.out.println("Количество дверей: " + doorCount);
        System.out.println("Двигатель: " + engine.getPower() + " л.с., " +
                engine.getFuel().getDescription());
    }

    public void honk() {
        System.out.println("Би-би! " + brand + " " + model + " сигналит");
    }
}