import java.util.Random;
import java.util.Scanner;

public class Quiz23 {
    public static void main(String[] args) {
        Random random = new Random();          
        Scanner input = new Scanner(System.in); 

        char menu = 'y'; // Variabel menu untuk memulai permainan(atur)
        do {
            int number = random.nextInt(10) + 1; // Menghasilkan angka random dari 1 sampai 10
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): "); // Meminta user untuk menebak angka
                int answer = input.nextInt(); // menginput tebakan dari user
                input.nextLine();
                if (answer < number) { //mengecek tebakan user jika lebih kecil maka akan memunculkan output dibawah
                    System.out.println("Tebakan Anda terlalu kecil.");
                } else if (answer > number) { //mengecek tebakan user jika lebih besar maka akan memunculkan output dibawah
                    System.out.println("Tebakan Anda terlalu besar.");
                } else {
                    System.out.println("Selamat! Anda menebak dengan benar.");//jika tebakan benar maka akan memunculkan code berikut
                    success = true;
                }
            } while (!success); // Mengulangi input tebakan jika tebakan salah

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?"); // Meminta user untuk mengulangi permainan
            menu = input.nextLine().charAt(0); // menginput input untuk menentukan apakah ingin mengulangi permainan
        } while (menu == 'y' || menu == 'Y'); // Mengulangi permainan jika user memilih 'Y' atau 'y'
    }
}
