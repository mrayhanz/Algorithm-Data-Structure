public class Mahasiswa17 {

    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa17(){}

    Mahasiswa17(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}