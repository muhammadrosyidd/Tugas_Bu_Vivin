import java.util.Scanner;

public class HargaBayar24 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String merk_buku;
            int harga, jumlah, jumlah_halaman;
            double dis, total, bayar, jmlDis;

            System.out.println("Masukkan Merk Buku ");
            merk_buku = input.nextLine();
            System.out.println("Masukkan Jumlah halaman buku ");
            jumlah_halaman = input.nextInt();
            System.out.println("Masukkan harga barang yang dibeli ");
            harga = input.nextInt();
            System.out.println("Masukkan Jumlah Barang yang Dibeli ");
            jumlah = input.nextInt();
            System.out.println("Masukkan Diskon ");
            dis = input.nextInt();

            total = harga * jumlah;
            jmlDis = total * dis;
            bayar = total - jmlDis;

            System.out.println("Buku : " + merk_buku);
            System.out.println("Jumlah Halaman : " + jumlah_halaman);
            System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
            System.out.println("Jumlah yang harus dibayar adalah " + bayar);
        }
    }
}
