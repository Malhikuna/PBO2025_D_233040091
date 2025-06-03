package Tugas_Pertemuan_14.Tugas2;

public class BankAccount {
    // Variabel accountNumber bersifat final agar tidak dapat diubah setelah diinisialisasi
    private final String accountNumber;

    // Variabel balance untuk menyimpan saldo rekening
    private static double balance;

    // Constructor untuk menginisialisasi nomor rekening dan saldo awal
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method untuk melakukan deposit ke rekening
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit sebesar " + amount + " berhasil.");
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    // Method final untuk menampilkan informasi rekening
    // Tidak bisa dioverride di subclass manapun
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }


}
