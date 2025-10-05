package Activiti3;

public enum Fuel {
    PETROL("Бензин"),
    DIESEL("Дизель"),
    ELECTRIC("Электричество"),
    KEROSENE("Керосин"),
    HORSE_POWER ("Лошадиная сила");

    private final String description;

    Fuel(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
