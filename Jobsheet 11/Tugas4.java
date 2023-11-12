import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[][] dataCabor = new String[4][5];// membuat array dua dimensi untuk menyimpan data atlet
        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Voli"};//array untuk menyimpan cabor apa saja yang ada

        // input data atlet untuk setiap cabang olahraga (5 atlet dalam 1 cabor)
        for (int i = 0; i < dataCabor.length; i++) {
            String cabor = namaCabor[i];
            System.out.println("Input data atlet untuk cabor " + cabor + ":");

            for (int j = 0; j < dataCabor[i].length; j++) {
                System.out.print("Nama Atlet " + (j + 1) + ": ");
                dataCabor[i][j] = input.nextLine();
            }
            System.out.println(); // baris kosong antara cabang olahraga(enter)
        }
        System.out.println("Data Atlet setiap Cabor");
        System.out.println("");
        // menampilkan informasi atlet dari setiap cabang olahraga dengan mengurutkan abjad nama
        for (int i = 0; i < dataCabor.length; i++) { //mengiterasi setiap cabor(index i)
            String cabor = namaCabor[i];
            System.out.println("Atlet " + cabor + ":\n");

            // mengurutkan data atlet berdasarkan abjad nama secara ascending
            for (int j = 0; j < dataCabor[i].length - 1; j++) { //index j mewakili atltet dalam setiap cabor
                for (int k = 0; k < dataCabor[i].length - j - 1; k++) { //index k merepresentasikan indeks atlet dalam satu cabang olahraga yang dibandingkan.
                    if (dataCabor[i][k].compareToIgnoreCase(dataCabor[i][k + 1]) > 0) { //menggunakan compareToIgnoreCase agar program bisa membandingkan dua nama atlet yang berdekatan dalam urutan abjad nama
                        // menukar posisi nama atlet dan diurutkan sesuai abjad
                        String namaAtlet = dataCabor[i][k];     
                        dataCabor[i][k] = dataCabor[i][k + 1]; //jika nama atlet pada indeks k lebih besar dari nama atlet pada indeks k + 1, maka posisi keduanya ditukar
                        dataCabor[i][k + 1] = namaAtlet;
                    }
                }
            }
            
            // menampilkan hasil setelah diurutkan
            for (int j = 0; j < dataCabor[i].length; j++) {
                System.out.println((j+1)+". "+dataCabor[i][j]);
            }

            System.out.println("\n");
        }
    }
}
