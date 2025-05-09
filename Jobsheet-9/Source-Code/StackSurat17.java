public class StackSurat17 {
    Surat17[] stack;
    int size;
    int top;

    StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }


    boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Surat17 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    Surat17 pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk diambil.");
            return null;
        } else {
            Surat17 surat = stack[top];
            top--;
            return surat;
        }
    }

    Surat17 peek(){
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        } else {
            return stack[top];
        }
    }

    int cariSurat(String cari){
        for (int i = top; i >= 0; i--) {
            if (stack[i].idSurat.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    void tampil(int i){
        System.out.println("ID Surat: " + stack[i].idSurat);
        System.out.println("Nama Mahasiswa: " + stack[i].namaMhs);
        System.out.println("Kelas: " + stack[i].kelas);
        System.out.println("Jenis Izin: " + stack[i].jenisIzin);
        System.out.println("Durasi: " + stack[i].durasi + " hari");
    }

    void tampilCari(int i){
        System.out.println("Surat di temukan pada tumpukan ke " + (top + 1-i) + " milik " + stack[i].namaMhs);
    }
}
