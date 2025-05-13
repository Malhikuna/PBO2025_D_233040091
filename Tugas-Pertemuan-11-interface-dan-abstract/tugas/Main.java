package Tugas_Pertemuan_11.tugas;

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Polygon");

        car.displayInfo();
        car.move();
        car.refuel();

        System.out.println(); // pemisah

        bicycle.displayInfo();
        bicycle.move();
        bicycle.refuel();
    }
}
