package Tugas_Pertemuan_14.Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        // Membuat beberapa objek Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Menampilkan jumlah instance yang telah dibuat
        System.out.println("Jumlah objek Counter: " + Counter.getInstanceCount());
    }
}
