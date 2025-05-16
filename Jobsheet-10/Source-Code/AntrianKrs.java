public class AntrianKrs {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalDiproses = 0;

    public AntrianKrs(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " masuk antrian.");
        }
    }

    void layaniKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses KRS.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa untuk KRS:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            System.out.print((i + 1) + ". ");
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
    }

    void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian terdepan:");
            for (int i = 0; i < Math.min(2, size); i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    int getJumlahAntrian() {
        return size;
    }

    int getJumlahProses() {
        return totalDiproses;
    }

    int getBelumKRS() {
        return 30 - totalDiproses;
    }
}
