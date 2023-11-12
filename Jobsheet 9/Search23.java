import java.util.Scanner;

public class Search23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Element Array : ");
        int jumlah = input.nextInt();
        int[] arrayInt = new int[jumlah];
        int key;
        int hasil = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan elemen array ke-" + i + " :");
            arrayInt[i] = input.nextInt();
        }
        System.out.print("masukkan key yang ingin dicari :");
        key = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            if (arrayInt[i] == key) {
                hasil = i;

                break;

            }
        }
        if (hasil == 0) {
            System.out.println("Key tidak ditemukan");

        } else {
            System.out.print("Key ada dalam array pada posisi indeks ke-" + hasil);

        }

    }

}
