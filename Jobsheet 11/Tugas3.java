import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = input.nextInt();

        if (N >= 3) {

            for (int i = 1; i <= N; i++) {// loop pertama (i) untuk mengatur baris

                for (int j = 1; j <= N; j++) {// loop kedua (j) untuk mengatur kolom

                    if (i == 1 || i == N || j == 1 || j == N) { // mengecek apakah saat ini berada di tepi (baris pertama, baris terakhir, kolom pertama, atau kolom terakhir)

                        System.out.print(" " + N);// jika berada di tepi maka cetak nilai N
                    } else {

                        System.out.print("  ");// jika tidak cetak spasi ganda
                    }
                }

                System.out.println();// pindah ke baris berikutnya
            }
        } else {

            System.out.println("Nilai N kurang dari 3");// menampilkan pesan jika nilai N kurang dari 3
        }
    }
}
