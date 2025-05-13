// Package tempat file ini disimpan
package Tugas_Pertemuan_11.latihan_2;

// Interface Kartu, berisi kontrak method yang harus diimplementasikan oleh class yang menggunakannya
public interface Kartu {

    // Method otentikasi, menerima parameter nama bertipe String
    // Mengembalikan nilai boolean (true atau false)
    public boolean otentikasi(String nama);

    // Method encode, menerima parameter pin bertipe String
    // Mengembalikan nilai String hasil encode
    public String encode(String pin);
}
