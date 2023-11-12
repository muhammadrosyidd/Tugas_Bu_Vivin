import java.util.Scanner;

public class nestedloop_2341760121 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] temps = new double[5][7];

        for (int i =0; i < temps.length; i++) { // Loop pertama untuk mengisi data suhu
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) { // Loop kedua untuk mengisi data suhu per hari
                System.out.print("Hari ke-" + (j+1) + ": ");
                temps[i][j] = input.nextDouble();  // Membaca suhu dari pengguna dan menyimpannya dalam array
            }
            System.out.println(); // memberikan baris kosong antara setiap kota (enter)
        }

        int urutan = 0;
        for (double [] kotaTemps : temps) { // menggunakan foreach untuk mengakses data suhu setiap kota
            System.out.print("Kota ke-" + (urutan + 1) + ": ");
            double total = 0.0;
            for (double temperatur : kotaTemps) { // menggunakan foreach untuk mengakses data suhu per hari
                System.out.print(temperatur + " ");
                total += temperatur; //mengakumulasi nilai temperatur ke dalam variabel total
            }
            double ratarata = total / kotaTemps.length; // menghitung rata-rata suhu per kota
            System.out.println("\n Rata rata: " + ratarata);
            urutan++; //menambah urutan kota
        }
    }
}
