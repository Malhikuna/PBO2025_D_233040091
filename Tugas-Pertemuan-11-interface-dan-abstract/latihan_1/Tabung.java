// Package tempat file ini disimpan
package Tugas_Pertemuan_11.latihan_1;

// Kelas Tabung adalah turunan dari Bentuk
public class Tabung extends Bentuk {
    // Properti tambahan: tinggi tabung
    private int tinggi;

    // Constructor default Tabung tanpa parameter
    public Tabung() {
        // Memanggil constructor Bentuk dengan nilai jari2 = 0
        super(0);
    }

    // Constructor Tabung dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        // Memanggil constructor Bentuk dengan nilai jari2
        super(jari2);
        // Mengatur nilai tinggi
        this.tinggi = tinggi;
    }

    // Override method luas() dari Bentuk
    // Menghitung luas permukaan tabung
    @Override
    public double luas() {
        // : 2 * PHI * r * (r + t)
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Getter untuk mengambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk mengatur nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
