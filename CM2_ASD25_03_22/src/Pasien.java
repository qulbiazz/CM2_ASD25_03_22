public class Pasien {
    String nama;
    String nik;
    String keluhan;

    Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-8s %-10s\n", nama, nik, keluhan);
    }

}