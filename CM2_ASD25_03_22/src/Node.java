public class Node {
    Node next,prev;
    Dokter dataDokter;
    Pasien dataPasien;
    TransaksiLayanan dataTransaksi;
    Node(Node prev, Pasien dataPasien,Dokter dataDokter, TransaksiLayanan dataTransaksiLayanan, Node next){
        this.next=next;
        this.prev=prev;
        this.dataPasien=dataPasien;
    }



}
