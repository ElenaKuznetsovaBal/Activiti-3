package Activiti3;

public final class Airplane extends AirVehicle {
    private final int passengerCapacity;
    private final int wingspan;

    public Airplane(String brand, String model, int year, Engine engine, int maxAltitude,
                    int passengerCapacity, int wingspan) {
        super(brand, model, year, engine, maxAltitude);
        this.passengerCapacity = passengerCapacity;
        this.wingspan = wingspan;
    }

    @Override
    public void getInfo() {
        System.out.println("\n=== САМОЛЕТ ===");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Макс. высота: " + maxAltitude + " м");
        System.out.println("Вместимость: " + passengerCapacity + " пассажиров");
        System.out.println("Размах крыльев: " + wingspan + " м");
        System.out.println("Двигатель: " + engine.getPower() + " л.с., " +
                engine.getFuelType().getDescription());
    }

    public void deployLandingGear() {
        System.out.println("Шасси выпущено");
    }
}

