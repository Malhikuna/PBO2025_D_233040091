package Tugas_Pertemuan_14.Tugas4;

// Class DatabaseConnection disimpan di file DatabaseConnection.java

public class DatabaseConnection {
    // Variabel static untuk menyimpan URL koneksi database
    public static String connectionString;

    // Static block untuk menginisialisasi connectionString
    static {
        connectionString = "jdbc:mysql://localhost:3306/db_mahasiswa";
        System.out.println("Static block dieksekusi: Connection string telah diinisialisasi.");
    }
}
