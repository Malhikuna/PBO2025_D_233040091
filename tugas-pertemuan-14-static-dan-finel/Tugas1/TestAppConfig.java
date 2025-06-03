package Tugas_Pertemuan_14.Tugas1;

// Class TestAppConfig disimpan di file TestAppConfig.java

public class TestAppConfig {
    public static void main(String[] args) {
        // Menampilkan nilai-nilai konstanta dari AppConfig
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("App Version: " + AppConfig.APP_VERSION);
        System.out.println("Default Timeout: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}
