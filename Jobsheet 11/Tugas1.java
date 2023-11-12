import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt(); // input nilai N (minimal 3)

        if (N > 3) { // memeriksa apakah nilai N lebih dari 3

            for (int i = 1; i <= N; i++) {// loop pertama untuk mengatur baris (i) dari 1 hingga N

                for (int j = N; j > i; j--) {// loop kedua untuk mengatur spasi sebelum angka (berkurang)
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {// loop ketiga untuk mencetak angka dari 1 hinga (i)
                    System.out.print(j);
                }
                System.out.println();// pindah baris
            }
        } else {

            System.out.println("Nilai N kurang dari atau sama dengan 3");// menampilkan pesan jika nilai N kurang dari atau sama dengan 3
        }
    }
}
