public class Dokter {
    String idDokter;
    String nama;

    Dokter(String id, String nama) {
        id = idDokter;
        this.nama = nama;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s\n", idDokter, nama);
    }
}
