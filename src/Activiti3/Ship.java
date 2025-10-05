package Activiti3;

public final class Ship extends WaterVehicle {
    private final int passengerCapacity;
    private final int displacement;

    public Ship(String brand, String model, int year, Engine engine, int length, boolean hasSail,
                int passengerCapacity, int displacement) {
        super(brand, model, year, engine, length, hasSail);
        this.passengerCapacity = passengerCapacity;
        this.displacement = displacement;
    }

    @Override
    public void getInfo() {
        System.out.println("\n КОРАБЛЬ");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Длина: " + length + " м");
        System.out.println("Водоизмещение: " + displacement + " тонн");
        System.out.println("Вместимость: " + passengerCapacity + " пассажиров");
        System.out.println("Парус: " + (hasSail ? "Да" : "Нет"));
        System.out.println("Двигатель: " + engine.getPower() + " л.с., " +
                engine.getFuel().getDescription());
    }

    public void soundHorn() {
        System.out.println("Ту-ту! Корабельный гудок");
    }
}
