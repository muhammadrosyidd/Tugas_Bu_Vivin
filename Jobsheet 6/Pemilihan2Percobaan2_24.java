import java.util.Scanner;
public class Pemilihan2Percobaan2_24 {
    public static void main (String []args){
        Scanner input24 = new Scanner (System.in);
        
        int sudut1,sudut2,sudut3,totalSudut;

        System.out.println("Masukkan sudut 1 :");
        sudut1=input24.nextInt();
        System.out.println("Masukkan sudut 2 ");
        sudut2=input24.nextInt();
        System.out.println("Masukkan sudut 3 ");
        sudut3=input24.nextInt();
        totalSudut = sudut1+sudut2+sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2==90) || (sudut3==90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if((sudut1==60)||(sudut2==60)||(sudut3==60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if((sudut1==sudut2)||(sudut1==sudut3)||(sudut2==sudut3))
            System.out.println("Segitiga sama kaki");
            else if((sudut1!=sudut2)||(sudut1!=sudut3)||(sudut2!=sudut3))
            System.out.println("Segitiga Sembarang");
        }else
        System.out.println("Bukan Segitiga");
        

    }
    
}
