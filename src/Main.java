import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2 урока ООП 2 **********************************************************");
        System.out.println();

        System.out.println("Список автомобилей:" + "\n");

        Car [] car = new Car[6];

        car[0] = new Car(null, null, 0, null, null, 0,"ландо", 5, "АКПП", "A102AA102", "лето");
        car[0].printCars();
        car[1] = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7, "купе", 5, "", "P555CX199", "");
        car[1].printCars();
        car[2] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "купе", 0, null, "", "");
        car[2].printCars();
        car[3] = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "кабриалет", 0, null, null, "зима");
        car[3].printCars();
        car[4] = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4,null, 0, null, "B153EC107",null);
        car[4].printCars();
        car[5] = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, null, 2, null, "", "зима");
        car[5].printCars();

        System.out.println();
        System.out.println("Список авто после сезонной замены резины и проверки Госномеров:" + "\n");

        String seazon = "зима";   // текущий сезон
        replacementTire (car, seazon);
        checkNumbers (car);
        //car[0].printCars(); car[1].printCars(); car[2].printCars(); car[3].printCars(); car[4].printCars(); car[5].printCars();

    }
// methods *************************************************************************************************************
    public static Car[] replacementTire (Car[] car, String seazon) {

        for (int i = 0; i < car.length; i++) {
            if (car[i].getTiresType().equals(seazon)) {
                continue;
            } else car[i].setTiresType(seazon);
        }
    return car;
    }
    public static Car[]  checkNumbers (Car[] car) {

    //    for (int i = 0; i < car.length; i++) {
    //        if (car[i].getTiresType().equals(seazon)) {
    //            continue;
    //        } else car[i].setTiresType(seazon);
    //    }
        return car;
    }

}