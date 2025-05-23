public class Mahasiswa17 {

        String nim, nama, kelas;
        double ipk;
    
        Mahasiswa17() {
    
        }
    
        Mahasiswa17(String nama, String nim, String kelas, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.kelas = kelas;
            this.ipk = ipk;
        }
    
        void tampilInformasi() {
            System.out.println(this.nama + "\t\t" + this.nim + "\t\t" + this.kelas + "\t\t" + this.ipk);
        }
}