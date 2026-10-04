public class Car {
    private int enginePower;
    private String carColor;
    private int yearOfManufacture;
    private int carMileage;

    public Car(int enginePower, String carColor, int yearOfManufacture, int carMileage) {
        this.enginePower = enginePower;
        this.carColor = carColor;
        this.yearOfManufacture = yearOfManufacture;
        this.carMileage = carMileage;
    }

    public int getEnginePower() { return enginePower; }
    public void setEnginePower(int enginePower) { this.enginePower = enginePower; }
    public String getCarColor() { return carColor; }
    public void setCarColor(String carColor) { this.carColor = carColor; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public void setYearOfManufacture(int yearOfManufacture) { this.yearOfManufacture = yearOfManufacture; }
    public int getCarMileage() { return carMileage; }
    public void setCarMileage(int carMileage) { this.carMileage = carMileage; }

    public void engineOn() {
        System.out.println("Двигатель заведён");
    }

    public void engineOff() {
        System.out.println("Двигатель выключен");
    }

    public void turnOnTurnSignal() {
        System.out.println("Поворотник включён");
    }

    public void openWindow() {
        System.out.println("Окно открыто");
    }
}
