package Activiti3;

import java.util.*;

public class TransportUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        // Создаем объекты разных видов транспорта
        vehicles.add(new Car("ОКА", "ВАЗ1111", 2022,
                new Engine(33, Fuel.PETROL), 4, 3));

        vehicles.add(new Bicycle("Салют", "Салют складной", 1986, 2, false));

        vehicles.add(new Airplane("Boeing", "737", 2020,
                new Engine(27000, Fuel.KEROSENE), 12500, 215, 36));

        vehicles.add(new Helicopter("Robinson", "R44", 2021,
                new Engine(245, Fuel.PETROL), 4300, 10, true));

        vehicles.add(new Ship("Пётр Великий", "Круизный пассажирский лайнер", 2019,
                new Engine(11200, Fuel.DIESEL), 141, false, 342, 4500));

        vehicles.add(new Boat("Ривьера", "3400 компакт", 2022,
                new Engine(170, Fuel.PETROL), 4, false, 6));

        System.out.println(" СИСТЕМА УПРАВЛЕНИЯ ТРАНСПОРТОМ \n");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Показать информацию о всех транспортных средствах");
            System.out.println("2. Запустить двигатели");
            System.out.println("3. Остановить двигатели");
            System.out.println("4. Демонстрация движения");
            System.out.println("5. Специальные возможности");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllInfo(vehicles);
                    break;
                case 2:
                    startAllEngines(vehicles);
                    break;
                case 3:
                    stopAllEngines(vehicles);
                    break;
                case 4:
                    demonstrateMovement(vehicles);
                    break;
                case 5:
                    demonstrateSpecialFeatures(vehicles);
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }

    private static void showAllInfo(List<Vehicle> vehicles) {
        System.out.println("\n ИНФОРМАЦИЯ О ТРАНСПОРТЕ ");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("\n" + (i + 1) + ".");
            vehicles.get(i).getInfo();
        }
    }

    private static void startAllEngines(List<Vehicle> vehicles) {
        System.out.println("\n ЗАПУСК ДВИГАТЕЛЕЙ ");
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    private static void stopAllEngines(List<Vehicle> vehicles) {
        System.out.println("\n ОСТАНОВКА ДВИГАТЕЛЕЙ ");
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }

    private static void demonstrateMovement(List<Vehicle> vehicles) {
        System.out.println("\n ДЕМОНСТРАЦИЯ ДВИЖЕНИЯ ");
        for (Vehicle vehicle : vehicles) {
            vehicle.move();

            if (vehicle instanceof AirVehicle airVehicle) {
                airVehicle.takeOff();
                airVehicle.land();
            } else if (vehicle instanceof WaterVehicle waterVehicle) {
                waterVehicle.dropAnchor();
            }
        }
    }
    private static void demonstrateSpecialFeatures(List<Vehicle> vehicles) {
        System.out.println("\n СПЕЦИАЛЬНЫЕ ВОЗМОЖНОСТИ ");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car car) {
                car.honk();
            } else if (vehicle instanceof Bicycle bicycle) {
                bicycle.ringBell();
            } else if (vehicle instanceof Airplane airplane) {
                airplane.deployLandingGear();
            } else if (vehicle instanceof Helicopter helicopter) {
                helicopter.hover();
            } else if (vehicle instanceof Ship ship) {
                ship.soundHorn();
            } else if (vehicle instanceof Boat boat) {
                boat.row();
            }
        }
    }
}
