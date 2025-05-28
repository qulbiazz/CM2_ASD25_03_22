public class Node {
    Node next,prev;
    Dokter dataDokter;
    Pasien dataPasien;
    TransaksiLayanan dataTransaksi;
    Node(Node prev, Pasien dataPasien, Node next){
        this.next=next;
        this.prev=prev;
        this.dataPasien=dataPasien;
    }
    Node(Node prev, Dokter dataDokter, Node next){
        this.next=next;
        this.prev=prev;
        this.dataDokter=dataDokter;
    }
    Node(Node prev, TransaksiLayanan dataTransaksi, Node next){
        this.next=next;
        this.prev=prev;
        this.dataTransaksi=dataTransaksi;
    }




}
