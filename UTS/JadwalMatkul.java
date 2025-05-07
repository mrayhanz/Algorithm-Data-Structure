public class JadwalMatkul {
    Jadwal[] jadwal = new Jadwal[7];
    int idx;

    void sortingbyday() {
        for (int i = 0; i < jadwal.length - 1; i++) {
            for (int j = i + 1; j < jadwal.length; j++) {
                if (jadwal[i] != null && jadwal[j] != null) {
                    if (jadwal[i].kodeHari() > jadwal[j].kodeHari() ||
                        (jadwal[i].kodeHari() == jadwal[j].kodeHari() &&
                        jadwal[i].kodeJam() > jadwal[j].kodeJam())) {
                        Jadwal temp = jadwal[i];
                        jadwal[i] = jadwal[j];
                        jadwal[j] = temp;
                    }
                }
            }
        }
    }
    
    void tambahJadwal(Jadwal j) {
        if (idx < jadwal.length) {
            jadwal[idx] = j;
            idx++;
        } else {
            System.out.println("Array jadwal sudah penuh!");
        }
    }

    void tampilkanJadwal() {
        for (int i = 0; i < idx; i++) {
            if (jadwal[i] != null) {
                jadwal[i].tampilDataJadwal();
            }
        }
    }
    void cariJadwal(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (jadwal[i].dosen.namaDosen.equalsIgnoreCase(nama)) {
                jadwal[i].tampilDataJadwal();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    void cekJadwal(){
        for(int i = 0; i < idx; i++){
            for(int j = i + 1; j < idx; j ++){
                if (jadwal[i] !=null && jadwal[j] !=null) {
                    if (jadwal[i].hari == jadwal[j].hari && jadwal[i].jam == jadwal[j].jam) {
                        System.out.println("Jadwal Bertabrakan pada " + jadwal[i].hari + " jam " + jadwal[i].jam);
                    }
                }
            }
        }
    }
}