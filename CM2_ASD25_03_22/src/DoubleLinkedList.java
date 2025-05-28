import java.util.Scanner;

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
            newNode.prev=tmp;
        }
        sizePasien++;
    }
    public void addlastDokter(Dokter item){
        if(isEmpty(headDokter)){
            headDokter = new Node(null, item, null);
        }else{
            Node tmp= headDokter;
            while (tmp.next != null) {
                tmp=tmp.next;
            }
            Node newNode = new Node(tmp, item, null);
            tmp.next=newNode;
            newNode.prev=tmp;
        }
    }
    public void print(){
        if(isEmpty(headPasien)){
            System.out.println(">> Antrian Kosong");
        }else{
            System.out.printf("%-10s %-8s %-10s\n", "Nama", "NIK", "Keluhan");
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

    public void pop(Scanner sc){
        if(isEmpty(headPasien)){
            System.out.println("Antrian kosong");
        }else{
            System.out.println("Pasien "+headPasien.dataPasien.nama+" dipanggil");
            System.out.println("Daftar Dokter jaga: ");
            System.out.printf("%-10s %-10s\n","kode","Nama");
            Node tmp=headDokter;
            while (tmp!=null) {
                tmp.dataDokter.tampilInformasi();
                tmp=tmp.next;
            }
            System.out.println("Pilih Dokter: ");
            System.out.print("Input kode dokter: ");
            String dokter=sc.nextLine();
            System.out.print("input durasi layanan: ");
            int durasi=sc.nextInt();
            addTransaksi(dokter, durasi, headPasien.dataPasien);
            headPasien=headPasien.next;
            headDokter.prev=null;
            sizePasien--;
        }
    }
    public void addTransaksi(String dokter, int durasi, Pasien pasien){
        Node tmp=headDokter;
        Dokter inputdr=null;
        while (tmp!=null) {
            if(tmp.dataDokter != null && tmp.dataDokter.idDokter.equalsIgnoreCase(dokter)){
                inputdr=tmp.dataDokter;
                break;
            }
            tmp=tmp.next;
        }
        TransaksiLayanan item=new TransaksiLayanan(pasien, inputdr , durasi);
        if(isEmpty(headTransaksi)){
            headTransaksi= new Node(null, item, null);
        }else{
            Node current=headTransaksi;
            while (current.next!=null) {
                current=current.next;
            }
            Node newnNode=new Node(tmp, item, null);
            current.next=newnNode;
            newnNode.prev=current;
        }
    }
    public void RiwayatTransaksi(){
        if(isEmpty(headTransaksi)){
            System.out.println(">> Data Riwayat Kosong");
        }else{
            System.out.printf("%-10s %-15s %-10s %-10s\n", "Nama", "Nama Dokter", "Durasi","total");
            Node tmp=headTransaksi;
            while (tmp !=null) {
                tmp.dataTransaksi.print();
                tmp=tmp.next;
            }
        }
    }
    public void sorting() {
        if (isEmpty(headTransaksi) || headTransaksi.next == null){
            System.out.println("Data kosong");
        } else if (headTransaksi.next==null) {
            headTransaksi.dataTransaksi.print();;
        } else {
            boolean swap;
            do {
                swap = false;
                Node temp = headTransaksi;
                while (temp.next != null) {
                    if (temp.dataTransaksi.pasien.nama.compareToIgnoreCase(temp.next.dataTransaksi.pasien.nama) < 0) {
                        TransaksiLayanan temp2 = temp.dataTransaksi;
                        temp.dataTransaksi = temp.next.dataTransaksi;
                        temp.next.dataTransaksi = temp2;
                        swap = true;
                    }
                    temp = temp.next;
                }
            } while (swap);
            RiwayatTransaksi();
        }
    }
}
