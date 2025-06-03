package Tugas_Pertemuan_14.Tugas2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek SavingsAccount
        SavingsAccount sa = new SavingsAccount("1234567890", 1000000);

        // Melakukan deposit ke rekening
        sa.deposit(1500000);

        // Menampilkan informasi rekening menggunakan method khusus subclas
        sa.displayAccountInfo();
    }
}
