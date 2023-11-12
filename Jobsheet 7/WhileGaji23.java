import java.util.Scanner;

public class WhileGaji23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur=0;
        double gajiLembur=0, totaGajiLembur=0;
        String jabatan;
        
        
        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan Karyawan ke - " + (i+1) + ":");
            jabatan = scan.next();
            System.out.println("Masukkan Jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {System.out.println("jabatan invalid");
            i--;
            continue;
            
        }
        totaGajiLembur += gajiLembur;
    }
        System.out.println("Total gaji lembur : " + totaGajiLembur);
    }
}