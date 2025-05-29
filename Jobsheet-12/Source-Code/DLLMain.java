import java.util.Scanner;

public class DLLMain {
    static Scanner scan = new Scanner(System.in);

    public static Mahasiswa17 inputMahasiswa() {
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
        return mhs;

    }
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah pada index tertentu");
            System.out.println("4. Tambah Sebelum Mahasiswa");
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Hapus setelah mahasiswa");
            System.out.println("8. Hapus pada index tertentu");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Melihat data Pertama");
            System.out.println("11. Melihat data Terakhir");
            System.out.println("12. Melihat data pada index tertentu");
            System.out.println("13. Melihat jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    
                
                    Mahasiswa17 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                }
            
                case 2 -> {
                    Mahasiswa17 mhs = inputMahasiswa();
                    list.addLast(mhs);
                }
                case 3 -> {
                    Mahasiswa17 mhs = inputMahasiswa();
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();

                    list.add(mhs,index);
                    break;
                }
                case 4 -> {
                    System.out.print("Masukkan Nim: ");
                    String nim = scan.nextLine();
                    Mahasiswa17 mhs = inputMahasiswa();
                    list.insertAfter(nim, mhs);
                }
                case 5 -> list.removeFirst();
                case 6 -> list.removeLast();
                case 7 -> {
                    System.out.print("Masukkan Nim Mahasiswa: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 8 -> {
                    System.out.print("Masukkan index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 9 -> list.print();
                case 10 -> list.getFirst().tampil();
                case 11 -> list.getLast().tampil();
                case 12 -> {
                    System.out.print("Masukkan index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(index).tampil();
                }
                case 13 -> System.out.println("Jumlah data: " + list.getSize());
            }
        } while (pilihan != 0);
    }
}
