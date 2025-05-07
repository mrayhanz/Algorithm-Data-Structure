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
        System.out.println("Dosen       : " + dosen.namaDosen);
        System.out.println("Mata Kuliah : " + matkul.namaMK);
        System.out.println("SKS         : " + matkul.sks);
        System.out.println("Hari        : " + hari);
        System.out.println("Jam         : " + jam);
        System.out.println("Durasi      : " + hitungMenit() + " menit\n");
    }

    int kodeHari() {
        switch (hari.toLowerCase()) {
            case "senin":
                return 1;
            case "selasa":
                return 2;
            case "rabu":
                return 3;
            case "kamis":
                return 4;
            case "jumat":
                return 5;
            case "sabtu":
                return 6;
            case "minggu":
                return 7;
            default:
                return 999;
        }
    }

    int kodeJam(){
        String[] time = jam.split(":");
        int jamInt = Integer.parseInt(time[0]);
        int menitInt = Integer.parseInt(time[1]);
        return jamInt * 60 + menitInt;
    }
}
