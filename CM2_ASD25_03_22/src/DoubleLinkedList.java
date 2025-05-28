public class DoubleLinkedList {
    Node headDokter, headPasien, headTransaksi;
    int sizePasien, sizetransaksi;

    public boolean isEmpty(Node head){
        return head== null;
    }
    public void addlastPasien(Pasien item){
        if(isEmpty(headPasien)){
            headPasien = new Node(null, item, null);
        }else{
            Node tmp= headPasien;
            while (tmp.next != null) {
                tmp=tmp.next;
            }
            Node newNode = new Node(tmp, item, null);
            tmp.next=newNode;
            sizePasien++;
        }
    }
    public void addlastDokter(Dokter item){
        if(isEmpty(headPasien)){
            headDokter = new Node(null, item, null);
        }else{
            Node tmp= headDokter;
            while (tmp.next != null) {
                tmp=tmp.next;
            }
            Node newNode = new Node(tmp, item, null);
            tmp.next=newNode;
        }
    }
    public void print(){
        if(isEmpty(headPasien)){
            System.out.println(">> Antrian Kosong");
        }else{
            System.out.printf("%-10s %-8s %-10s", "Nama", "NIK", "Keluhan");
            Node tmp=headPasien;
            while (tmp !=null) {
                tmp.dataPasien.tampilInformasi();
                tmp=tmp.next;
            }
        }
    }
    public void sisaAntrian(){
        System.out.println(">> Sisa Antrian: "+sizePasien);
    }
}
