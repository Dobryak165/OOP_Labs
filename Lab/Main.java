public class Main {
    public static void main(String[] args) {
        Firetruck firetruck = new Firetruck(300, "Красный", 2006, 20000, "Синий", true ,"Пожарные", 1, "Пожарный автомобиль пенного тушения", 25);

        firetruck.engineOn();
        firetruck.beaconsOn();
        firetruck.sirensOn();
        firetruck.extendLadder();
    }
}

