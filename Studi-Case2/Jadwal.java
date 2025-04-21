public class Jadwal {
    Dosen dosen = new Dosen();
    Matakuliah matkul = new Matakuliah();
    String hari, jam;


    Jadwal(){}

    Jadwal(Dosen dosen, Matakuliah matkul, String hari, String jam) {
        this.dosen = dosen;
        this.matkul = matkul;
        this.hari = hari;
        this.jam = jam;
    }

    int hitungMenit(){
        return matkul.sks * 50;
    }

    void tampilDataJadwal(){
        System.out.println("Dosen       : " + dosen);
        System.out.println("Mata Kuliah : " + matkul);
        System.out.println("SKS         : " + matkul.sks);
        System.out.println("Hari        : " + hari);
        System.out.println("Jam         : " + jam);
        System.out.println("Durasi      : " + hitungMenit() + " menit\n");
    }
}
