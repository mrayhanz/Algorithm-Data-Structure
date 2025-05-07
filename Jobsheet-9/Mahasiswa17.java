public class Mahasiswa17 {

    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa17(){}

    Mahasiswa17(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}