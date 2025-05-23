import java.util.Scanner;
public class QueueLinkedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas antrian: ");
        int antrian = sc.nextInt();
        QueueLinkedList queue = new QueueLinkedList(antrian);
        int pilihan;

        do {
            System.out.println("\n--- MENU ANTRIAN LAYANAN ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Paling Akhir");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Jumlah Mahasiswa Mengantri");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa17 mhs = new Mahasiswa17(nama, nim, kelas, ipk);
                    queue.addQueue(mhs);
                    break;
                case 2:
                    Mahasiswa17 dipanggil = queue.getQueue();
                    if (dipanggil != null) {
                        System.out.println("Antrian dipanggil: ");
                        dipanggil.tampilInformasi();
                    }
                    break;
                case 3:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("Antrian terdepan: ");
                        queue.firstQueue().tampilInformasi();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 6:
                    if (!queue.isEmpty()) {
                        System.out.println("Antrian paling akhir: ");
                        queue.lastQueue().tampilInformasi();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 7:
                    queue.print();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa mengantri: " + queue.countMhs());
                    break;
                case 9:
                    queue.clearQueue();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}    
