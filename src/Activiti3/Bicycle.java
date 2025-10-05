package Activiti3;

public final class Bicycle extends LandVehicle {
    private final boolean hasGears;

    public Bicycle(String brand, String model, int year, int wheelCount, boolean hasGears) {
        super(brand, model, year, null, wheelCount);
        this.hasGears = hasGears;
    }

    @Override
    public void startEngine() {
        System.out.println("Крути педали!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Прекрати крутить педали!");
    }
    @Override
    public void getInfo() {
        System.out.println("\n ВЕЛОСИПЕД ");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Количество колес: " + wheelCount);
        System.out.println("Наличие передач: " + (hasGears ? "Да" : "Нет"));
        System.out.println("Тип привода: " + Fuel.HORSE_POWER.getDescription());
    }
    public void ringBell() {
        System.out.println("Дзинь-дзинь! Звонок велосипеда");
    }
}

