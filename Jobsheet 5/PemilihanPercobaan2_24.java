import java.util.Scanner;

public class PemilihanPercobaan2_24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.println("Nilai UAS        : ");
        float uas = input24.nextFloat();
        System.out.println("Nilai UTS        : ");
        float uts = input24.nextFloat();
        System.out.println("Nilai Kuis       : ");
        float kuis = input24.nextFloat();
        System.out.println("Nilai Tugas      : ");
        float tugas = input24.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total > 80 && total <= 100)
            System.out.print("Nilai " + total + " dengan kualifikasi Sangat Baik (A)");
        else if (total > 73 && total <= 80)
            System.out.print("Nlai " + total +  " dengan kualifikasi Lebih dari Baik (B+)");
        else if (total > 65 && total <= 73)
            System.out.print("Nilai " + total + " dengan kualifikasi Baik (B)");
        else if (total > 60 && total <= 65)
            System.out.print("Nilai " + total + " dengan kualifikasi Lebih dari Cukup (C+)");
        else if (total > 50 && total <= 60)
            System.out.print("Nilai " + total + " dengan kualifikasi Cukup (C)");
        else if (total > 39 && total <= 50)
            System.out.print("Nilai " + total + " dengan kualifikasi Kurang (D)");
        else
            System.out.print("Nilai " + total + " dengan kualifikasi Gagal (E)");

        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println(" sehingga anda " + message);

    }

}
