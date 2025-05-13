package Tugas_Pertemuan_11.tugas;

// Subclass 2: Sepeda sebagai kendaraan
class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    // Implementasi metode dari interface Movable
    public void move() {
        System.out.println(name + " bergerak dengan dikayuh.");
    }

    // Implementasi metode abstract dari Vehicle
    public void refuel() {
        System.out.println(name + " tidak memerlukan bahan bakar.");
    }
}