public class Dosen{
    String nidn;
    String namaDosen;


    Dosen(){}

    Dosen(String nidn, String namaDosen){
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }

    void tampilDataDosen(){
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + namaDosen); 
    }
}
