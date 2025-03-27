package Pertemuan_6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("000000001", "MIFTAHUL FADLI MUTTAQIN, S.T.,M.T.");
        Dosen dosen2 = new Dosen("000000002", "DR. IR LEONY LIDYA, MT");
        Dosen dosen3 = new Dosen("000000003", "ADE SUKENDAR, ST.,MT");
        Dosen dosen4 = new Dosen("000000004", "ADE SUKENDAR, ST.,MT");
        Dosen dosen5 = new Dosen("000000005", "ERIK, ST.,M.Kom.");
        Dosen dosen6 = new Dosen("000000006", "Siroj Nur Ulum, S.T., M.T.");

        // Create objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Praktikum Infrastruktur", "A", 2, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "A", 3, dosen2);
        MataKuliah mk3 = new MataKuliah("003", "Rekayasa Perangkat Lunak", "B", 3, dosen3);

        MataKuliah mk4 = new MataKuliah("004", "Praktikum Pemrograman 1", "A", 3, dosen4);
        MataKuliah mk5 = new MataKuliah("005", "Praktikum Multimedia", "AB", 3, dosen5);
        MataKuliah mk6 = new MataKuliah("006", "Pemrograman Berorientasi Objek", "A", 3, dosen6);

        // Create objek KHS
        KartuHasilStudi khs1 = new KartuHasilStudi("3");
        khs1.addMataKuliah(mk1);
        khs1.addMataKuliah(mk2);
        khs1.addMataKuliah(mk3);
        khs1.hitungIPS();

        KartuHasilStudi khs2 = new KartuHasilStudi("4");
        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk5);
        khs2.addMataKuliah(mk6);
        khs2.hitungIPS();

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040091", "Hikmal Maulana");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.addKHS(khs2);
        transkrip.hitungIPK();
        transkrip.display();
    }
}

/* Kesimpulan */
/*
Relasi komposisi pada program ini membantu dalam membangun model data yang lebih realistis dan terstruktur. Setiap kelas memiliki tanggung jawab yang jelas, dan hubungan antar kelas memastikan bahwa data tetap konsisten dan relevan.

Implementasi ini sangat cocok untuk sistem akademik karena mencerminkan hubungan nyata antara mahasiswa, transkrip nilai, semester, dan mata kuliah.
 */