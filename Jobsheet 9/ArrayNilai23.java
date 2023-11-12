import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[]args){
        Scanner input =new Scanner (System.in);
        int[] NilaiAkhir=new int [10];
        for(int i = 0;i<NilaiAkhir.length;i++){
            System.out.print("Masukkan nilai akhir ke -"+i+" :");
            NilaiAkhir[i]=input.nextInt();
        }
        for (int i=0;i<10;i++){
            if(NilaiAkhir[i]>70){
            System.out.println("Mahasiswa ke-"+i+" lulus");
        }else{
            System.out.println("Mahasiswa ke-"+i+" tidak lulus");
        }
    }
    }
}
