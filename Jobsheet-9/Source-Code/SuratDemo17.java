import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat17 stackSurat = new StackSurat17(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Surat Izin Mahasiswa ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan ID");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (stackSurat.isFull()) {
                        System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
                        break;
                    }
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine(); 

                    Surat17 surat = new Surat17(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    Surat17 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat berhasil diverifikasi:");
                        stackSurat.tampil(stackSurat.top + 1);
                    }
                    break;

                case 3:
                    Surat17 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir Milik " + terakhir.namaMhs);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan ID Surat yang dicari: ");
                    String cariId = input.nextLine();
                    int indeks = stackSurat.cariSurat(cariId);
                    if (indeks != -1) {
                        System.out.println("Surat ditemukan:");
                        stackSurat.tampilCari(indeks);
                    } else {
                        System.out.println("Surat dengan ID tersebut tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);
    }
}
