// Package tempat file ini disimpan
package Tugas_Pertemuan_11.latihan_1;

// Kelas utama tempat program dieksekusi
public class Main {
    // Method main: titik awal program Java
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 10
        Bentuk lingkaran = new Lingkaran(10);

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Bentuk tabung = new Tabung(10, 5);

        // Menampilkan data lingkaran: jari-jari dan luasnya
        System.out.println("== Lingkaran == \n" +
                "jari2: " + lingkaran.getJari2() + "\n" +   // Memanggil method getJari2() dari Lingkaran
                "luas: " + lingkaran.luas() + "\n");       // Memanggil method luas() dari Lingkaran

        // Menampilkan data tabung: jari-jari dan luas permukaannya
        System.out.println("== Tabung == \n" +
                "jari2: " + tabung.getJari2() + "\n" +     // Memanggil method getJari2() dari Tabung
                "luas: " + tabung.luas());                 // Memanggil method luas() dari Tabung
    }
}
