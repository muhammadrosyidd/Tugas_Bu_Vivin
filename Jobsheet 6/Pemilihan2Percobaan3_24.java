import java.util.Scanner;

public class Pemilihan2Percobaan3_24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input24.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input24.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 25000000)
                pajak = 0.15;
            else if (penghasilan <= 35000000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else 
        System.out.println("Masukkan Kategori Salah");
    }
}