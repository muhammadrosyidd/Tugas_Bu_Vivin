import java.util.Scanner;

public class UcapanTerimakasih_23 {
public static void main(String[]args){
        
       UcapanTerimakasih();
       
        
      
        
    }
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = input.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ucapan tambahan : ");
        String ucapantambah = input.nextLine();
        input.close();
        return ucapantambah;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        String ucapan = UcapanTambahan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a loe for learning and made me feel like I could ask you anything "+ucapan);
    }
    
    
    
}
