import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        Dokter[] dr = new Dokter[4];
        dr[0] = new Dokter("dr01", "Wike Ratanca");
        dr[1] = new Dokter("dr02", "Santi Runica");
        dr[2] = new Dokter("dr03", "Aam Antanica");
        dr[3] = new Dokter("dr04", "Slamet Sugito");
        for (int i = 0; i < 4; i++) {
            dll.addlastDokter(dr[i]);
        }
        int pilih;

        do {
            System.out.println("SISTEM ANTRIAN KLINIK");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Input Nama Pasien: ");
                    String pasien = input.nextLine();
                    System.out.print("NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    Pasien tambah = new Pasien(pasien, nik, keluhan);
                    dll.addlastPasien(tambah);
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    dll.pop(input);
                    break;
                case 4:
                    dll.sisaAntrian();
                    break;
                case 5:
                    dll.RiwayatTransaksi();
                    break;
                case 6:
                    dll.sorting();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilih != 0);
    }
}
