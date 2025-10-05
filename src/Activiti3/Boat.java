package Activiti3;

public final class Boat extends WaterVehicle {
    private final int passengerCapacity;

    public Boat(String brand, String model, int year, Engine engine, int length, boolean hasSail, int passengerCapacity) {
        super(brand, model, year, engine, length, hasSail);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("\n ЛОДКА");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Длина: " + length + " м");
        System.out.println("Парус: " + (hasSail ? "Да" : "Нет"));
        System.out.println("Вместимость: " + passengerCapacity + " человек");
        if (engine != null) {
            System.out.println("Двигатель: " + engine.getPower() + " л.с., " +
                    engine.getFuel().getDescription());
        }
    }

    public void row() {
        System.out.println("Лодка идёт на веслах");
    }
}

