package Tugas_Pertemuan_11.tugas;

// Abstract class: Menyediakan dasar umum untuk semua kendaraan
abstract class Vehicle implements Movable {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // Metode umum yang bisa digunakan semua kendaraan
    public void displayInfo() {
        System.out.println("Nama Kendaraan: " + name);
    }

    // Abstract method: Harus diimplementasi oleh subclass
    public abstract void refuel(); // cara isi bahan bakar
}