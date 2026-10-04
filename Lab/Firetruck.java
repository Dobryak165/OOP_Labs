public class Firetruck extends EmergencyServicesVehicle {
    private int division;
    private String typeOfFiretruck;
    private int ladderLength;

    public Firetruck(int enginePower, String carColor, int yearOfManufacture, int carMileage, String colorOfBeacons, boolean hasSiren, String department, int division, String typeOfFiretruck, int ladderLength) {
        super(enginePower, carColor, yearOfManufacture, carMileage, colorOfBeacons, department, hasSiren);
        this.division = division;
        this.typeOfFiretruck = typeOfFiretruck;
        this.ladderLength = ladderLength;
    }

    public int getDivision() { return division; }
    public void setDivision(int division) { this.division = division;}
    public String getTypeOfFiretruck() { return typeOfFiretruck; }
    public void setTypeOfFiretruck(String typeOfFiretruck) { this.typeOfFiretruck = typeOfFiretruck; }
    public int getLadderLength() { return ladderLength; }
    public void setLadderLength(int ladderLength) { this.ladderLength = ladderLength; }

    public void extendLadder() {
        System.out.println("Лестница выдвинута");
    }

    public void retractLadder() {
        System.out.println("Лестница убрана");
    }
    
    public void pumpOn() {
        System.out.println("Насос включён");
    }
}
