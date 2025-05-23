public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();
        Mahasiswa17 mhs1 = new Mahasiswa17("Alvaro", "22212", "TI-1A", 3.75);
        Mahasiswa17 mhs2 = new Mahasiswa17("Bimon", "22213", "TI-1H", 3.8);
        Mahasiswa17 mhs3 = new Mahasiswa17("Cintia", "22214", "TI-1E", 3.6);
        Mahasiswa17 mhs4 = new Mahasiswa17("Dirga", "22215", "TI-1F", 3.9);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
