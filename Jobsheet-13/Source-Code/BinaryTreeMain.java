public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();

        bst.addRekursif(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa17("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar Semua Mahasiswa (in order traversal) :");
        bst.traverseInorder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.addRekursif(new Mahasiswa17("244160131","Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa17("244160205","Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa17("244160170","Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal: ");
        bst.traverseInorder(bst.root);
        System.out.println("\nPreOrder Traversal: ");
        bst.traversePreorder(bst.root);
        System.out.println("\nPostOrder Traversal: ");
        bst.traversePostorder(bst.root);
        
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInorder(bst.root);

        System.out.println();
        Mahasiswa17 mhsMin = bst.cariMinIPK();
        System.out.println("Mahasiswa dengan IPK terkecil: " + mhsMin.nama + " (" + mhsMin.ipk + ")");

        Mahasiswa17 mhsMax = bst.cariMaxIPK();
        System.out.println("Mahasiswa dengan IPK terbesar: " + mhsMax.nama + " (" + mhsMax.ipk + ")");

        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.5);

    }
}