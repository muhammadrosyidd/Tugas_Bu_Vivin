import java.util.Scanner;

public class DoWhileCuti23 {
    public static void main(String[] args) {

        int jatahcuti, jumlahhari;
        String konfirmasi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)?");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahhari = sc.nextInt();
                if (jumlahhari <= jatahcuti) {
                    jatahcuti -= jumlahhari;
                    System.out.println("Sisa jatah cuti: " + jatahcuti);
                } else {
                    System.out.println("Jumlah cuti yang diminta melebihi jatah cuti Anda.");
                }
            } else {
                System.out.println("baik");
                break;
            }
        } while (jatahcuti > 0);
    }

}
