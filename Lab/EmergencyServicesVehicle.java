public class EmergencyServicesVehicle extends Car {
    private String colorOfBeacons;
    private String department;
    private boolean hasSiren;

    public EmergencyServicesVehicle(int enginePower, String carColor, int yearOfManufacture, int carMileage, String colorOfBeacons, String department, boolean hasSiren) {
        super(enginePower, carColor, yearOfManufacture, carMileage);
        this.colorOfBeacons = colorOfBeacons;
        this.department = department;
        this.hasSiren = hasSiren;
    }

    public String getColorOfBeacons() { return colorOfBeacons; }
    public void setColorOfBeacons(String colorOfBeacons) { this.colorOfBeacons = colorOfBeacons;}
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public boolean isHasSiren() { return hasSiren; }
    public void setHasSiren(boolean hasSiren) { this.hasSiren = hasSiren; }
    

    
    public void beaconsOn() {
        System.out.println("Маячки включены");
    }

        public void beaconsOff() {
        System.out.println("Маячки выключены");
    }

    public void sirensOn() {
        System.out.println("Сирена включена");
    }

        public void sirensOff() {
        System.out.println("Сирена выключена");
    }
}