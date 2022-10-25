import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2 урока ООП 2 **********************************************************");
        System.out.println();

        System.out.println("Список автомобилей:" + "\n");

        Car [] car = new Car[6];

        car[0] = new Car(null, null, 0, null, null, 0,"ландо", 5, "АКПП",
                "", "лето", new Car.Key(true,false), new Car.Insurance(null,5450,null));
        car[1] = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7, "купе", 5, "",
                "", "", new Car.Key(true,false), new Car.Insurance(null,5450,null));
        car[2] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "купе", 0, null,
                "z050ЕС102", "", new Car.Key(true,false), new Car.Insurance(null,5450,null));
        car[3] = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "кабриалет", 0, null,
                "А111Тф002", "зима", new Car.Key(true,false), new Car.Insurance(null,5450,null));
        car[4] = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4,null, 0, null,
                "",null, new Car.Key(true,false), new Car.Insurance(null,5450,null));
        car[5] = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, null, 2, null,
                "Р700Ся702", "зима", new Car.Key(true,false), new Car.Insurance(null,5450,null));

        printCars(car);

        System.out.println();
        System.out.println("Список авто после сезонной замены резины:" + "\n");

        String season = "зима";           // текущий сезон
        replacementTire (car, season);    // сезонная замена авторезины

        printCars(car);
        System.out.println();
        checkNumbers (car);

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
    public static void  checkNumbers (Car[] car) {
        char[] chars = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

        for (int i = 0; i < car.length; i++) {
           String num = car[i].getRegNumber();

           if ( num.equals("не выдан") ) continue;

           if ( num.length() != 9) {
               System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() + " не корректный!");
               continue;
           }
           if (!num.endsWith("102") && !num.endsWith("702") && !num.endsWith("002")) {
               System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() + " не корректный!");
               continue;
           }
           if (!Character.isDigit(num.charAt(1))
                   || !Character.isDigit(num.charAt(2))
                   || !Character.isDigit(num.charAt(3))) {
               System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() + " не корректный!");
               continue;
           }
           if (num.substring(1,4).equals("000"))  {
               System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() + " не корректный!");
               continue;
           }
// Проверка на корректное исаользование букв, входящих в Госномер авто на заданных позициях:
                     for  (int j = 0; j < chars.length; j++) {
                         if (num.charAt(0) == chars[j]) break;
                         if (num.charAt(0) != chars[j] && j == chars.length - 1)
                            System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() +
                                                                                                     " не корректный!");
                     }
                     for  (int j = 0; j < chars.length; j++) {
                         if (num.charAt(4) == chars[j]) break;
                         if (num.charAt(4) != chars[j] && j == chars.length - 1)
                            System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() +
                                                                                                     " не корректный!");
                     }
                     for  (int j = 0; j < chars.length; j++) {
                         if (num.charAt(5) == chars[j]) break;
                         if (num.charAt(5) != chars[j] && j == chars.length - 1)
                       System.out.println("Госномер автомобиля " + car[i].getBrand() + " " + car[i].getModel() +
                                                                                                     " не корректный!");
                     }
                }
        }
    public static void printCars (Car[] car) {
        for (Car el : car) {
            System.out.println(el);
        }
    }

} // class Main