package Tugas_Pertemuan_14.Tugas2;

// Class SavingsAccount disimpan dalam file SavingsAccount.java
// Merupakan subclass dari BankAccount

public class SavingsAccount extends BankAccount {

    // Constructor SavingsAccount memanggil constructor BankAccount menggunakan super
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Berikut contoh kode yang mencoba meng-override method final
    // Method displayAccountInfo di BankAccount bertipe final sehingga tidak dapat dioverride

    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Ini info dari tabungan.");
    }
    */

    // ERROR:
    // Jika kode di atas diaktifkan (uncomment), maka akan muncul error:
    // "Cannot override the final method from BankAccount"
    // karena method displayAccountInfo di superclass menggunakan keyword final
    // Keyword final berfungsi untuk melindungi method agar tidak bisa diubah perilakunya di subclass
    // Hal ini penting untuk menjaga integritas data di aplikasi perbankan

    // Solusi:
    // Buat method baru khusus di subclass untuk kebutuhan tambahan
    public void displaySavingsInfo() {
        System.out.println("=== Informasi Rekening Tabungan ===");
        // Memanggil method final dari superclass tanpa mengubah isinya
        super.displayAccountInfo();
    }
}
