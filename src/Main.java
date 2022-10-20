import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2 урока ООП 2 **********************************************************");
        System.out.println();

        System.out.println("Задание 1 и 2." + "\n");

        Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
        car1.printCars();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        car2.printCars();
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        car3.printCars();
        Car car4 = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4);
        car4.printCars();
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        car5.printCars();
        Car car6 = new Car(null, null, 0, null, null, 0);
        car6.printCars();
    }
}