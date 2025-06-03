package Tugas_Pertemuan_14.Tugas3;

// Class Counter disimpan di file Counter.java

public class Counter {
    // Variabel static untuk menghitung jumlah instance
    private static int instanceCount = 0;

    // Konstruktor akan menambah instanceCount setiap kali objek dibuat
    public Counter() {
        instanceCount++;
    }

    // Method static untuk mengambil nilai instanceCount
    public static int getInstanceCount() {
        return instanceCount;
    }
}
