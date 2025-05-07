import java.util.Scanner;

public class JadwalMatkulMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        Dosen d1 = new Dosen("D001", "Budi Hartono");
        Dosen d2 = new Dosen("D002", "Rina Marlina");
        Dosen d3 = new Dosen("D003", "Agus Wijaya");
        Dosen d4 = new Dosen("D004", "Siti Aminah");
        Dosen d5 = new Dosen("D005", "Andi Pratama");

        Matakuliah mk1 = new Matakuliah("MK001", "Struktur Data", 3);
        Matakuliah mk2 = new Matakuliah("MK002", "Pemrograman Java", 3);
        Matakuliah mk3 = new Matakuliah("MK003", "Basis Data", 3);
        Matakuliah mk4 = new Matakuliah("MK004", "Algoritma dan Pemrograman", 2);
        Matakuliah mk5 = new Matakuliah("MK005", "Matematika Diskrit", 2);
        Matakuliah mk6 = new Matakuliah("MK006", "Jaringan Komputer", 3);
        Matakuliah mk7 = new Matakuliah("MK007", "Pemrograman Web", 3);

        Jadwal j1 = new Jadwal(d1, mk1, "Senin", "08:00");
        Jadwal j2 = new Jadwal(d2, mk2, "Selasa", "10:00");
        Jadwal j3 = new Jadwal(d3, mk3, "Rabu", "09:00");
        Jadwal j4 = new Jadwal(d1, mk4, "Kamis", "13:00");
        Jadwal j5 = new Jadwal(d4, mk5, "Jumat", "07:00");
        Jadwal j6 = new Jadwal(d5, mk6, "Senin", "11:00");
        Jadwal j7 = new Jadwal(d2, mk7, "Rabu",  "14:00");

        JadwalMatkul jadwal = new JadwalMatkul();
        jadwal.tambahJadwal(j1);
        jadwal.tambahJadwal(j2);
        jadwal.tambahJadwal(j3);
        jadwal.tambahJadwal(j4);
        jadwal.tambahJadwal(j5);
        jadwal.tambahJadwal(j6);
        jadwal.tambahJadwal(j7);

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Jadwal");
            System.out.println("4. Urutkan Jadwal Berdasarkan Hari dan Jam");
            System.out.println("5. Cari Jadwal Berdasarkan Nama dosen");
            System.out.println("6. Cek Ada Jadwal Bentrok Atau Tidak");
            System.out.println("7. Keluar");

            System.out.print("Pilihan Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                System.out.println("=== Data Dosen ===");
                Dosen[] daftarDosen = {d1, d2, d3, d4, d5};
                for (Dosen d : daftarDosen) {
                    System.out.println("NIDN: " + d.nidn);
                    System.out.println("Nama: " + d.namaDosen);
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("=== Data Mata Kuliah ===");
                Matakuliah[] daftarMK = {mk1, mk2, mk3, mk4, mk5, mk6, mk7};
                for (Matakuliah mk : daftarMK) {
                    System.out.println("Kode MK: " + mk.kodeMK);
                    System.out.println("Nama Mata Kuliah: " + mk.namaMK);
                    System.out.println("SKS: " + mk.sks);
                    System.out.println();
                }
                break;

                case 3:
                    System.out.println("=== Data Jadwal ===");
                    jadwal.tampilkanJadwal();
                    break;

                case 4:
                    System.out.println("=== Urutkan Jadwal Berdasarkan Hari ===");
                    jadwal.sortingbyday();
                    jadwal.tampilkanJadwal();
                    break;

                case 5:
                    System.out.println("=== Cari Jadwal Berdasarkan Nama Dosen ===");
                    System.out.print("Masukkan nama dosen: ");
                    String namaCari = sc.nextLine();
                    jadwal.cariJadwal(namaCari);
                    break;

                case 6:
                    System.out.println("=== Cek Apakah ada jadwal yang bertabrakan ===");
                    jadwal.cekJadwal();
                    break;

                case 7:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
            }
        } while (menu != 7);
    }
}
