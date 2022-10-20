import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2 урока ООП 2 **********************************************************");
        System.out.println();

        System.out.println("Список автомобилей:" + "\n");

        Car [] car = new Car[6];

        car[0] = new Car(null, null, 0, null, null, 0,"ландо", 5, "АКПП", "A102AA102", "лето");
        car[1] = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7, "купе", 5, "", "P555CX199", "");
        car[2] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "купе", 0, null, "", "");
        car[3] = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "кабриалет", 0, null, null, "зима");
        car[4] = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4,null, 0, null, "B153EC107",null);
        car[5] = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, null, 2, null, "", "зима");

        printCars(car);

        System.out.println();
        System.out.println("Список авто после сезонной замены резины и проверки Госномеров:" + "\n");

        String season = "зима";           // текущий сезон
        replacementTire (car, season);    // сезонная замена авторезины
        checkNumbers (car);
        printCars(car);

    }
// methods *************************************************************************************************************
    public static Car[] replacementTire (Car[] car, String season) {

        for (int i = 0; i < car.length; i++) {
            if (car[i].getTiresType().equals(season)) {
                continue;
            } else car[i].setTiresType(season);
        }
    return car;
    }
    public static Car[]  checkNumbers (Car[] car) {

        // пока не придумал, как проверить Госномер авто....
    return car;
    }
    public static void printCars (Car[] car) {
        for (Car el : car) {
            System.out.println(el);
        }
    }

}