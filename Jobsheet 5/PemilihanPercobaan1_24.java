
import java.util.Scanner;

public class PemilihanPercobaan1_24{

    public static void main(String []args){
        try (Scanner input24 = new Scanner(System.in)) {
            System.out.println("Masukkan Angka");
            int angka = input24.nextInt();
            
            String hasil;
            hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
            System.out.println(angka+ " adalah " +hasil);
        }
    }
}