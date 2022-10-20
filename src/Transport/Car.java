package Transport;

public class Car {

    final String brand;
    final String model;
    final int yearOfIssue;
    final String assemblyCountry;
    final String bodyType;   // тип кузова
    final int places;             // Количество мест

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfIssue() { return yearOfIssue; }
    public String getAssemblyCountry() { return assemblyCountry; }
    public String getBodyType() { return bodyType; }
    public int getPlaces() { return places; }
    // ***************************************************************
    double engineVolume;
    String bodyColor;
    String gearbox;         // коробка передач
    String regNumber;          // Регистрационный номер
    String tiresType;       // тип авторезины - летняя или зимняя

    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) { this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }
    public String getBodyColor() { return bodyColor;  }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) { this.bodyColor = "белый";
        } else this.bodyColor = bodyColor;
    }
    public String getGearbox() { return gearbox;  }
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
    public String getRegNumber() { return regNumber; }
    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) { this.regNumber = "не выдан";
        }  else  this.regNumber = regNumber;
    }
    public String getTiresType() { return tiresType; }
    public void setTiresType(String tiresType) {
        if (tiresType == null || tiresType.isEmpty() || tiresType.isBlank()) { this.tiresType = "летняя";
        } else this.tiresType = tiresType;
    }

    // Constructor ****************************************************
    public Car (String brand, String model, int yearOfIssue, String assemblyCountry, String bodyColor, double engineVolume,
                String bodyType, int places,String gearbox, String regNumber, String tiresType ) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
            } else this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
            } else this.model = model;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
            } else this.engineVolume = engineVolume;
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "белый";
            } else this.bodyColor = bodyColor;
        if (yearOfIssue == 0) { this.yearOfIssue = 2000;
            } else this.yearOfIssue = yearOfIssue;
        if (assemblyCountry == null || assemblyCountry.isEmpty() || assemblyCountry.isBlank()) {
            this.assemblyCountry = "default";
            } else this.assemblyCountry = assemblyCountry;
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "хэнчбек";
            }  else  this.bodyType = bodyType;
        if (places == 0) { this.places = 5;
            } else this.places = places;
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) {
            this.regNumber = "не выдан";
            }  else  this.regNumber = regNumber;
        if (gearbox == null || gearbox.isEmpty() || gearbox.isBlank()) {
            this.gearbox = "МКПП";
            }  else this.gearbox = gearbox;
        if (tiresType == null || tiresType.isEmpty() || tiresType.isBlank()) {
            this.tiresType = "летняя";
            } else this.tiresType = tiresType;
        }

// methods ***********************************************************
@Override
public String toString() {
    return brand + " " + model + ", " + yearOfIssue + "-го года, сборка " +
              assemblyCountry + ", " + "цвет " + bodyColor + ", V двигателя - " + engineVolume + " л., кузов - " +
              bodyType + ", количество мест " + places + ", Госномер " + regNumber + ", " + gearbox +
              ", тип авторезины - " +  tiresType + ".";
        }

}