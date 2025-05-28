public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasilayanan;
    int biaya;
    TransaksiLayanan(Pasien pasien, Dokter dokter, int durasilayanan){
        this.pasien=pasien;
        this.dokter=dokter;
        this.durasilayanan=durasilayanan;
    }
    public int biaya(int durasilayanan){
        return 50_000*durasilayanan;
    }
    public void print(){
        System.out.printf("%-10s %-15s %-10s %-10d\n",pasien.nama,dokter.nama,durasilayanan,biaya(durasilayanan));;
    }
}
