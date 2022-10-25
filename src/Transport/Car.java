package Transport;

import java.time.LocalDate;

public class Car {
    public static class Insurance {  //**** Вложенный класс Страховка ***************************
        private static LocalDate timeIns;
        private final float costIns;
        private final String numberIns;

        public LocalDate getTimeIns() { return timeIns;
        }
         public float getCostIns() { return costIns;
        }

        public String getNumberIns() { return numberIns;
        }

        public Insurance(LocalDate timeIns, float costIns, String numberIns) {
            this.timeIns = timeIns != null ? timeIns : LocalDate.now().plusDays(1);
            this.costIns = costIns != 0.0f ? costIns : 3000.0f;
            this.numberIns = numberIns != null && numberIns.length() == 9 ? numberIns : "default";
        }
        public static String isRealInsurance () {
           if (LocalDate.now().isBefore(timeIns)) {
               return " страховка действующая.";
           } else return " страховка просрочена.";
        }
    }

    public static class Key {  //**** Вложенный класс Key ***************************

        private static boolean remoteStart;     // Дистанционный запуск
        private static boolean keylessEntry;    // Бесключевой доступ

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean getRemoteStart() { return remoteStart;
        }
        public void setRemoteStart(boolean remoteStart) {
            this.remoteStart = remoteStart;
        }
        public boolean getKeylessEntry() { return keylessEntry;
        }
        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }
    }
//******************************************************************************
    private final String brand;
    private final String model;
    private final int yearOfIssue;
    private final String assemblyCountry;
    private final String bodyType;   // тип кузова
    private final int places;             // Количество мест
    private Key key;
    private Insurance insurance;

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfIssue() { return yearOfIssue; }
    public String getAssemblyCountry() { return assemblyCountry; }
    public String getBodyType() { return bodyType; }
    public int getPlaces() { return places; }
    // ***************************************************************
    private double engineVolume;
    private String bodyColor;
    private String gearbox;         // коробка передач
    private String regNumber;          // Регистрационный номер
    private String tiresType;       // тип авторезины - летняя или зимняя
    //Car.new Key();

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
        if (tiresType == null || tiresType.isEmpty() || tiresType.isBlank()) { this.tiresType = "лето";
        } else this.tiresType = tiresType;
    }
    public Key getKey() { return key;
    }
    public void setKey(Key key) { this.key = key;
    }
    public Insurance getInsurance() { return insurance;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    // Constructor ****************************************************
    public Car (String brand, String model, int yearOfIssue, String assemblyCountry, String bodyColor, double engineVolume,
                String bodyType, int places,String gearbox, String regNumber, String tiresType, Key key, Insurance insurance ) {
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
            this.tiresType = "лето";
            } else this.tiresType = tiresType;
        this.key = key;
        this.insurance = insurance;
        }

// methods ***********************************************************
@Override
public String toString() {
    return brand + " " + model + ", " + yearOfIssue + "-го года, сборка " +
              assemblyCountry + ", " + "цвет " + bodyColor + ", V двигателя - " + engineVolume + " л., кузов - " +
              bodyType + ", количество мест " + places + ", Госномер " + regNumber + ", " + gearbox +
              ", тип авторезины - " +  tiresType +
              ", ключ с автозапуском " + Key.remoteStart + ", с бесключевым доступом " + Key.keylessEntry +
              "," + Insurance.isRealInsurance();
        }

}
