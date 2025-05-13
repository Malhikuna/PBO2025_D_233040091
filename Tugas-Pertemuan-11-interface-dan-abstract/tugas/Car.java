package Tugas_Pertemuan_11.tugas;

// Subclass 1: Mobil sebagai kendaraan
class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    // Implementasi metode dari interface Movable
    public void move() {
        System.out.println(name + " bergerak dengan roda dan mesin.");
    }

    // Implementasi metode abstract dari Vehicle
    public void refuel() {
        System.out.println(name + " mengisi bensin di SPBU.");
    }
}
