import java.util.Scanner;

public class Segitiga24 {
    
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int alas, tinggi;
            float luas;

            System.out.println("Masukkan alas: ");
            alas = sc.nextInt();
            System.out.println("Masukkan Tinggi: ");
            tinggi = sc.nextInt();

            luas = alas * tinggi / 2;

            System.out.println("Luas Segitiga: "+ luas);
        }

    }
    
}
