public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray17(){
        this.dataMahasiswa = new Mahasiswa17[15];
    }

    void populateData(Mahasiswa17 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInorder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInorder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInorder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa17 mhs) {
        if (dataMahasiswa[0] == null) {
            this.dataMahasiswa[0] = mhs;
            idxLast++;
            return;
        }

        int idx = 0;
        while (idx < dataMahasiswa.length && dataMahasiswa[idx] != null) {
            if (mhs.ipk < dataMahasiswa[idx].ipk) {
                idx = 2 * idx + 1;
            } else {
                idx = 2 * idx + 2;
            }
        }

        if (idx >= dataMahasiswa.length) {
            System.out.println("Array penuh, tidak bisa menambahkan data.");
            return;
        }
        

        dataMahasiswa[idx] = mhs;
        idxLast++;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}
