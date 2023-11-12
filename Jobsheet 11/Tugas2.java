import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5) : ");
        int N = input.nextInt();// input nilai N (minimal 5)

        if (N > 5) { // emeriksa apakah nilai N lebih dari 5

            for (int i = N; i >= 1; i--) { // loop pertama untuk mengatur baris (i) dari N ke 1

                for (int j = 1; j <= i; j++) { // loop kedua untuk mengatur kolom (j) dari 1 hingga i
                    // mencetak karakter '*' sebanyak nilai j
                    System.out.print("*");
                }

                System.out.println(); // pindah ke baris berikutnya
            }
        } else {

            System.out.println("Nilai N anda kurang dari atau sama dengan 5"); // menampilkan pesan kesalahan jika nilai N kurang ddari 5
        }
    }
}
