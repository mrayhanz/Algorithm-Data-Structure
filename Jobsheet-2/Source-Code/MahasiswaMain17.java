public class MahasiswaMain17 {
    public static void main(String[] args) {
        Mahasiswa17 mhs1 = new Mahasiswa17();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J" ;
        mhs1.ipk = 3.55;    

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa17 mhs2 = new Mahasiswa17("Annisa Nabila" ,"2141720160",3.25,"TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa17 mhs3 = new Mahasiswa17("Muhammad Rayhan" ,"244107020027",3.80,"TI 1H");
        mhs3.updateIPK(4.00);
        mhs3.tampilkanInformasi();
        
        }
}