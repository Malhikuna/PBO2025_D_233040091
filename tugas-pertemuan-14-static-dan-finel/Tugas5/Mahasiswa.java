package Tugas_Pertemuan_14.Tugas5;

public class Mahasiswa {
    // Variabel nim bersifat final agar tidak bisa diubah setelah di-set via constructor
    private final String nim;

    // Variabel nama dapat diubah jika diperlukan
    private String nama;

    // Variabel static untuk menghitung jumlah objek Mahasiswa yang telah dibuat
    private static int totalMahasiswa = 0;

    // Konstanta static final untuk batas maksimum SKS yang berlaku global
    public static final int MAX_SKS = 24;

    // Constructor Mahasiswa
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Setiap objek dibuat, totalMahasiswa bertambah
    }

    // Method untuk menampilkan informasi Mahasiswa
    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Batas Maksimum SKS: " + MAX_SKS);
        System.out.println();
    }

    // Static method untuk mengambil nilai totalMahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}