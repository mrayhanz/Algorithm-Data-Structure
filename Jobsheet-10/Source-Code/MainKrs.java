import java.util.Scanner;

public class MainKrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKrs antrian = new AntrianKrs(10);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Jumlah Sudah KRS");
            System.out.println("11. Mahasiswa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Kosong" : "Tidak Kosong");
                    break;
                case 7:
                    System.out.println(antrian.isFull() ? "Penuh" : "Tidak Penuh");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Sudah KRS: " + antrian.getJumlahProses());
                    break;
                case 11:
                    System.out.println("Belum KRS: " + antrian.getBelumKRS());
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
