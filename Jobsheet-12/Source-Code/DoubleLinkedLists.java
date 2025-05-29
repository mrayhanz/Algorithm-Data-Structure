public class DoubleLinkedLists {

    Node17 head;
    Node17 tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void add(Mahasiswa17 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        } 
        
        Node17 temp = head;
        for (int i = 0; i < index - 1; i++) {
        if (temp == null) {
        System.out.println("Index melebihi panjang list");
        return;
        }
        temp = temp.next;
        }
        
        if (temp.next == null) {
            addLast(data);
            return;
        }
        
        Node17 newNode = new Node17(data);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAfter(String keyNim, Mahasiswa17 data){
        Node17 current = head;

        while(current != null && !current.data.nim.equals(keyNim)){
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan Nim " + keyNim + " tidak ditemukan.");
            return;
        }

        Node17 newNode = new Node17(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            newNode.next.prev = newNode;
            current.next = newNode;        
        }

        System.out.println("NOde berhasil disisipkan setelah Nim " + keyNim);
    }


    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa di hapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Node berhasil dihapus");
        System.out.println("Data yang terhapus adalah : " + head.data);
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa di hapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Node berhasil dihapus");
        System.out.println("Data yang terhapus adalah : " + tail.data);
    }

    public void removeAfter(String Key){
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa di hapus");
            return;
        }
        
        Node17 temp = head;

        while (temp != null && !temp.data.nim.equals(Key)) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Node setelah Nim " + Key + " tidak ditemukan.");
            return;
        }
        temp.next.prev = temp;
        temp.next = temp.next.next;
    }

    public void remove(int index){
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa di hapus");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }
        Node17 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Index melebihi panjang list");
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    Mahasiswa17 getFirst(){
        return head.data;
    }

    Mahasiswa17 getLast(){
        return tail.data;
    }

    Mahasiswa17 getIndex(int index){
        if (isEmpty()) {
            return null;
        }

        Node17 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize(){
        int size = 0;
        Node17 temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void print() {
        Node17 temp = head;
        if (isEmpty()) {
            System.out.println("Data kosong!");
            return;
        }
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }
}