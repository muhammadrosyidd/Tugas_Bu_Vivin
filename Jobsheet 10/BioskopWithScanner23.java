import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("===MENU===");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Data Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu (1/2/3): ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();
                System.out.print("Masukkan baris: ");
                baris = input.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = input.nextInt();
                input.nextLine();

                penonton[baris-1][kolom-1] = nama;
                
                if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                    // Cek apakah kursi sudah terisi
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    } else {
                        System.out.println("Kursi sudah terisi oleh penonton lain.");
                        System.out.print("Masukkan baris kembali: ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom kembali: ");
                        kolom = input.nextInt();
                        input.nextLine();

                        // Cek apakah nomor baris/kolom kursi tersedia setelah dimasukkan kembali
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Data penonton berhasil diinput.");
                            } else {
                                System.out.println("Kursi masih terisi. Data penonton tidak diinput.");
                            }
                        } else {
                            System.out.println("Nomor baris/kolom kursi tidak tersedia. Data penonton tidak diinput.");
                        }
                    }
                } else {
                    System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                }
            } else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("Baris %d, Kolom %d: %s\n", i+1, j+1, penonton[i][j]);
                        } else {
                            System.out.printf("Baris %d, Kolom %d: *\n", i+1, j+1);
                        }
                    }
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }

            System.out.print("Lanjut ke menu lain? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            //System.out.print("Input penonton lainnya? (y/n): ");
            //next = input.nextLine();
            
            //if (next.equalsIgnoreCase("n")) {
                //break;
            //}

        }
    
    }
}
