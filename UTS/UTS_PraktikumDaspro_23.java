import java.util.Scanner;

public class UTS_PraktikumDaspro_23 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        String jurusan;
        int siswa;
        double matematika,fisika,bing,bindo,nilai;

        System.out.println("Masukkan jumlah siswa yang daftar : ");
        siswa=input.nextInt();

        for (int i = 1; i <= siswa; i++) {
        System.out.print("Masukkan jurusan Siswa " + i +" IPA/IPS/Bahasa : ");
        jurusan=input.next();
        System.out.print("Masukkan nilai Matematika : ");
        matematika=input.nextDouble();
        System.out.print("Masukkan nilai Fisika : ");
        fisika=input.nextDouble();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        bing=input.nextDouble();
        System.out.print("Masukkan nilai Bahasa Indonesia : ");
        bindo=input.nextDouble();

        nilai=(matematika+fisika+bing+bindo)/4;

        System.out.print("Nilai rata rata siswa "+i+" adalah : "+nilai);
        System.out.println("");

        if(jurusan.equalsIgnoreCase("IPA")&&((matematika > 80)||(matematika>70)&&(fisika>70) && (nilai > 80))){
            System.out.println("Siswa " + i +" lolos seleksi di jurusan D4 TI dan Jurusan D3 MI");
        }else if (jurusan.equalsIgnoreCase("IPS") && (matematika>=80)&&(nilai > 80)){
            System.out.println("Siswa " + i +" lolos seleksi di jurusan D4 TI");
        }else if (jurusan.equalsIgnoreCase("bahasa")&&(nilai>80)&&(matematika>70)&&(fisika>70)&&(bindo>70)){
            System.out.println("Siswa " + i +" lolos seleksi di jurusan D3 MI");
        }else {
            System.out.println("Siswa " + i +" tidak lolos seleksi");
        }
    }
}
}
