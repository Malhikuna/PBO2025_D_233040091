// Package tempat file ini disimpan
package Tugas_Pertemuan_11.latihan_1;

// Kelas Lingkaran adalah turunan dari kelas Bentuk
public class Lingkaran extends Bentuk {

    // Constructor Lingkaran
    // Menerima parameter jari-jari, lalu memanggil constructor superclass (Bentuk)
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Override method luas() dari superclass Bentuk
    // Menghitung luas lingkaran menggunakan rumus: PHI * r * r
    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }
}
