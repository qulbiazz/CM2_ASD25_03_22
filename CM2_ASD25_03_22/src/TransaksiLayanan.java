public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasilayanan;
    int biaya;
    TransaksiLayanan(Pasien pasien, Dokter dokter, int durasilayanan, int biaya){
        this.pasien=pasien;
        this.dokter=dokter;
        this.durasilayanan=durasilayanan;
        this.biaya=biaya;
    }
    public int biaya(int durasilayanan){
        return 50_000*durasilayanan;
    }
    public void print(){
        System.out.printf("-%8s -%15s -%8s -%8d",pasien.nama,dokter.nama,durasilayanan,biaya);;
    }
}
