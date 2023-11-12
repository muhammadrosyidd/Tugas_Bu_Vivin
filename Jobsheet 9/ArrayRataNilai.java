import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        int[]nilaiMhs=new int[jumlahMahasiswa];
        int total =0;
        double ratarata;
        int banyakLulus = 0;
        int banyakTidakLulus = 0;

        for(int i=0;i<jumlahMahasiswa;i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" :");
            nilaiMhs[i]=input.nextInt();
        }

        for(int i = 0;i<jumlahMahasiswa;i++){
            if (nilaiMhs[i] > 70) {
                banyakLulus++;
            } else {
                banyakTidakLulus++;
            }
        }

        int[]nilaiLulus = new int[banyakLulus];
        int[]nilaiTidakLulus = new int[banyakTidakLulus];

        int y = 0;
        int n = 0;
        for(int i = 0;i<jumlahMahasiswa;i++){
            if (nilaiMhs[i] > 70) {
                nilaiLulus[y] = nilaiMhs[i];
                y++;
            } else {
                nilaiTidakLulus[n] = nilaiMhs[i];
                n++;
            }
        }

        double totalLulus = 0;
        for(int i = 0;i<banyakLulus;i++){
            totalLulus += nilaiLulus[i];
        }

        double totalTidakLulus = 0;
        for(int i = 0;i<banyakTidakLulus;i++){
            totalTidakLulus += nilaiTidakLulus[i];
        }
        for(int i = 0;i<jumlahMahasiswa;i++){
            total += nilaiMhs[i];
        }
        System.out.println("Total Nilai Mahasiswa : "+total);
        ratarata = totalLulus / banyakLulus;
        System.out.println("Rata rata nilai mahasiswa yang lulus =  "+ratarata);

        ratarata = totalTidakLulus / banyakTidakLulus;
        System.out.println("Rata rata nilai mahasiswa yang tidak lulus =  "+ratarata);

        System.out.println("Jumlah Mahasiswa yang Lulus : "+banyakLulus);
        System.out.println("Jumlah Mahasiswa yang tidak Lulus : "+banyakTidakLulus);
    }
}
