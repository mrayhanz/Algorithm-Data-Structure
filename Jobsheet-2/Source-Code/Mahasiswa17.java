public class Mahasiswa17 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa17(){
        
    }

    Mahasiswa17(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru){
        if (ipkBaru > 4.0 || ipkBaru < 0) {
            System.out.println("IPK harus antara 0-4.0");
        }else{
            ipk = ipkBaru;
        }
    }
    
    String nilaiKinerja(){
        if (ipk >= 3.5){            
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0){
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else{
            return "Kinerja Kurang";
        }
    }
}
