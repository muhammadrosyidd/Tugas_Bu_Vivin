import java.util.Scanner;
public class Star23{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N =");
        int N = input.nextInt();

        
        for(int i=0;i<=N;i--){
            System.out.print("*");
        }
    }
    }
// }for(int iOuter=1;iOuter<=N;iOuter++){