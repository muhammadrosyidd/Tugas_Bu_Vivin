import java.util.Scanner;

public class Gaji24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotalGaji;
        int gaji, potGaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah gaji : ");
        gaji=input.nextInt();
        System.out.println("Masukkan jumlah potongan Gaji : ");
        potGaji=input.nextInt();

        TotalGaji = (jmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotalGaji);
    }

}
