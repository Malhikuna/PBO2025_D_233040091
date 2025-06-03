package Tugas_Pertemuan_14.Tugas5;

// Class TestMahasiswa disimpan di file TestMahasiswa.java
// Digunakan untuk menjalankan program

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("233040091", "Hikmal");
        Mahasiswa m2 = new Mahasiswa("233040111", "Dzaki");
        Mahasiswa m3 = new Mahasiswa("233040090", "Murod");

        // Menampilkan info masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan total jumlah mahasiswa yang telah dibuat
        System.out.println("Total Mahasiswa terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
