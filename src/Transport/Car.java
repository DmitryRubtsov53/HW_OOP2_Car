package Transport;

public class Car {

    String brand;
    String model;
    double engineVolume;
    String bodyColor;
    int yearOfIssue;
    String assemblyCountry;

    public Car (String brand, String model, int yearOfIssue, String assemblyCountry, String bodyColor, double engineVolume) {
        if (brand == null) { this.brand = "default";
        } else this.brand = brand;
        if (model == null) { this.model = "default";
        } else this.model = model;
        if (engineVolume == 0) { this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
        if (bodyColor == null) { this.bodyColor = "белый";
        } else this.bodyColor = bodyColor;
        if (yearOfIssue == 0) { this.yearOfIssue = 2000;
        } else this.yearOfIssue = yearOfIssue;
        if (assemblyCountry == null) { this.assemblyCountry = "default";
        } else this.assemblyCountry = assemblyCountry;


    }
       public void printCars() {
            System.out.println(brand + " " + model + ", " + yearOfIssue + "-го года выпуска, сборка " +
                    assemblyCountry + ", " + "цвет " + bodyColor + ", объем двигателя - " + engineVolume + " литра.");
        }

}