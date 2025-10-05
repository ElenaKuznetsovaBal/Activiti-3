package Activiti3;

public final class Helicopter extends AirVehicle {
    private final int rotorDiameter;
    private final boolean hasRescueEquipment;

    public Helicopter(String brand, String model, int year, Engine engine, int maxAltitude,
                      int rotorDiameter, boolean hasRescueEquipment) {
        super(brand, model, year, engine, maxAltitude);
        this.rotorDiameter = rotorDiameter;
        this.hasRescueEquipment = hasRescueEquipment;
    }

    @Override
    public void getInfo() {
        System.out.println("\n ВЕРТОЛЕТ");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Максимальная высота: " + maxAltitude + " м");
        System.out.println("Диаметр лопастей: " + rotorDiameter + " м");
        System.out.println("Спасательное оборудование: " + (hasRescueEquipment ? "Да" : "Нет"));
        System.out.println("Двигатель: " + engine.getPower() + " л.с., " +
                engine.getFuel().getDescription());
    }

    public void hover() {
        System.out.println("Вертолет завис");
    }
}
