// Package tempat file ini disimpan
package Tugas_Pertemuan_11.latihan_1;

// Kelas Bentuk bersifat abstract, artinya tidak bisa langsung diinstansiasi
public abstract class Bentuk {
    // Properti PHI bernilai 3.14, dipakai untuk rumus lingkaran/tabung
    protected double PHI = 3.14;

    // Properti jari2 (jari-jari), bisa diakses oleh subclass
    protected int jari2;

    // Constructor Bentuk, menerima parameter jari-jari
    public Bentuk(int jari2) {
        super(); // Memanggil constructor kelas induk (Object), walaupun sebenarnya boleh dihapus
        this.jari2 = jari2;
    }

    // Method abstract luas() → harus di-override oleh subclass (seperti Lingkaran & Tabung)
    public abstract double luas();

    // Method getter untuk mengambil nilai jari2
    public int getJari2() {
        return jari2;
    }

    // Method setter untuk mengatur nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}