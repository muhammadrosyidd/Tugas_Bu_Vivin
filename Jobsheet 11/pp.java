import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("==========MENU==========");
        //System.out.println("1. INPUT DATA PEMINJAM");
        //System.out.println("2. INPUT DATA BUKU");
        //System.out.println("3. KELUAR");
        //int menu = input.nextInt();

        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM peminjam: ");
        String NIM = input.nextLine();
        
        System.out.print("Masukkan jumlah buku yang ingin dipinjam: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // Consume the newline character

        String[][] bukuPeminjaman = new String[jumlahBuku][10]; // Array 2 dimensi untuk menyimpan informasi buku peminjaman

        int totalDenda = 0; // Variabel untuk menyimpan total denda keseluruhan

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.print("\nMasukkan nama buku ke-" + (i + 1) + ": ");
            bukuPeminjaman[i][0] = input.nextLine();
            System.out.print("Lama meminjam (DD): ");
            bukuPeminjaman[i][1] = input.nextLine();
            System.out.print("Lama meminjam (MM): ");
            bukuPeminjaman[i][2] = input.nextLine();
            System.out.print("Lama meminjam (YYYY): ");
            bukuPeminjaman[i][3] = input.nextLine();
            System.out.print("Tanggal peminjaman (DD): ");
            bukuPeminjaman[i][4] = input.nextLine();
            System.out.print("Tanggal pengembalian (MM): ");
            bukuPeminjaman[i][5] = input.nextLine();
            System.out.print("Tanggal pengembalian (YYYY): ");
            bukuPeminjaman[i][6] = input.nextLine();
            System.out.print("Tanggal pengembalian (DD): ");
            bukuPeminjaman[i][7] = input.nextLine();
            System.out.print("Tanggal pengembalian (MM): ");
            bukuPeminjaman[i][8] = input.nextLine();
            System.out.print("Tanggal pengembalian (YYYY): ");
            bukuPeminjaman[i][9] = input.nextLine();

            int hariTerlambat = Integer.parseInt(bukuPeminjaman[i][7]) - (Integer.parseInt(bukuPeminjaman[i][4]) + Integer.parseInt(bukuPeminjaman[i][1]));
            int bulanTerlambat = Integer.parseInt(bukuPeminjaman[i][8]) - (Integer.parseInt(bukuPeminjaman[i][5]) + Integer.parseInt(bukuPeminjaman[i][2]));
            int tahunTerlambat = Integer.parseInt(bukuPeminjaman[i][9]) - (Integer.parseInt(bukuPeminjaman[i][6]) + Integer.parseInt(bukuPeminjaman[i][3]));

            if (tahunTerlambat > 0 || bulanTerlambat > 0 || hariTerlambat > 0) {
                int totalHariTerlambat = tahunTerlambat * 365 + bulanTerlambat * 30 + hariTerlambat;
                int denda = totalHariTerlambat * 500;
                totalDenda += denda; // Menambahkan denda buku saat ini ke total denda keseluruhan
                System.out.println("Anda terkena denda keterlambatan sebesar: " + denda);
                System.out.println("\n=======INFORMASI LENGKAP=======");
                System.out.println("Buku ke-" + (i + 1) + ": " + bukuPeminjaman[i][0]);
                System.out.println("Total Denda: " + denda);
            } else {
                System.out.print("\n=======INFORMASI LENGKAP======= \nBuku ke-" + (i + 1) + ": " + bukuPeminjaman[i][0] + "\nBuku Berhasil Dikembalikan");
            }
        }

        System.out.println("\n=======INFORMASI LENGKAP=======\nNAMA : " +nama+ "\nNIM : " +NIM+ "\nJUMLAH BUKU" +jumlahBuku+ "\nTOTAL DENDA : " +totalDenda);
        if (totalDenda > 0) {
            System.out.println("\nTotal denda keseluruhan: " + totalDenda);
            System.out.print("Apakah anda ingin membayar denda? (ya/tidak): ");
            String jawaban = input.next();

            if (jawaban.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan nominal pembayaran anda: ");
                int bayar = input.nextInt();

                while (bayar < totalDenda) {
                    System.out.println("Nominal pembayaran anda tidak mencukupi, silahkan masukkan nominal yang mencukupi");
                    System.out.print("Masukkan nominal pembayaran anda: ");
                    bayar = input.nextInt();
                }
                if (bayar > totalDenda) {
                    double kembalian = bayar - totalDenda;
                    System.out.println("Kembalian anda adalah: " + kembalian);
                } else {
                    System.out.print("Uang anda pas, ");
                }
                System.out.println("Buku berhasil dikembalikan");
            } else if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Anda memilih untuk tidak membayar denda");
                System.out.println("Buku berhasil dikembalikan");
            } else {
                System.out.println("Input tidak valid, Buku berhasil dikembalikan tanpa pembayaran");
            }
        }
        
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judulCari = input.next();

        // Search for the book title within the bukuPeminjaman array
        boolean bookFound = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (bukuPeminjaman[i][0].equalsIgnoreCase(judulCari)) {
                System.out.println("Buku ditemukan di indeks: " + i);
                System.out.println("Judul Buku: " + bukuPeminjaman[i][0]);
                bookFound = true;
                break; // Stop searching after finding the first match
            }
        }

        if (!bookFound) {
            System.out.println("Buku tidak ditemukan.");
        }
        // System.out.println("\n=======DAFTAR BUKU YANG TERLAMBAT PENGEMBALIAN=======");

        // for (int i = 0; i < jumlahBuku; i++) {
        //     int hariTerlambat = Integer.parseInt(bukuPeminjaman[i][7]) - (Integer.parseInt(bukuPeminjaman[i][4]) + Integer.parseInt(bukuPeminjaman[i][1]));
        //     int bulanTerlambat = Integer.parseInt(bukuPeminjaman[i][8]) - (Integer.parseInt(bukuPeminjaman[i][5]) + Integer.parseInt(bukuPeminjaman[i][2]));
        //     int tahunTerlambat = Integer.parseInt(bukuPeminjaman[i][9]) - (Integer.parseInt(bukuPeminjaman[i][6]) + Integer.parseInt(bukuPeminjaman[i][3]));

        //     if (tahunTerlambat > 0 || bulanTerlambat > 0 || hariTerlambat > 0) {
        //         System.out.println("\nBuku ke-" + (i + 1) + ": " + bukuPeminjaman[i][0]);
        //         System.out.println("Tanggal Pengembalian: " +
        //         bukuPeminjaman[i][7] + "/" + bukuPeminjaman[i][8] + "/" + bukuPeminjaman[i][9]);
        //         System.out.println("Denda: " + (hariTerlambat * 500));
        //     }
        // }   
    }
} 
    

