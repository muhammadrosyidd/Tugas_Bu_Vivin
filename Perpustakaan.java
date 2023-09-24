import java.util.Scanner;
public class Perpustakaan {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        String NamaPeminjam,NamaBuku,NIM;
        int JumlahBuku,JumlahHari;
        double harga_buku,bayar;

        System.out.println("Masukkan NIM anda: ");
        NIM= input.nextLine();
        System.out.println("Masukkan Nama Anda ");
        NamaPeminjam= input.nextLine();
        System.out.println("Masukkan nama Buku ");
        NamaBuku= input.nextLine();
        System.out.println("Jumlah Buku ");
        JumlahBuku=input.nextInt();
        System.out.println("Masukkan harga Buku ");
        harga_buku=input.nextInt();
        System.out.println("Jumlah Hari ");
        JumlahHari=input.nextInt();
        System.out.println("\n");

        bayar= JumlahBuku*harga_buku;
        

        System.out.println("******Transaksi******");
        System.out.println("NIM         : "+NIM);
        System.out.println("Nama        : "+NamaPeminjam);
        System.out.println("Buku        : "+NamaBuku);
        System.out.println("Jumlah Buku : "+JumlahBuku);
        System.out.println("Lama Pinjam : "+JumlahHari);
        System.out.println("Bayar       : "+bayar);

    }
    
}
