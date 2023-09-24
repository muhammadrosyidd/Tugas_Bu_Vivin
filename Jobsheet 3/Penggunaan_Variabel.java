

public class Penggunaan_Variabel {


public static void main(String[] args) {

    String Hobi,Pandai,JenisKelamin;
    int Umur;
    double $ipk,tinggi;

    Hobi="Futsal";
    Pandai="Ya";
    JenisKelamin="Laki-laki";
    Umur=19;
    $ipk=3.90;
    tinggi=175;

    System.out.println("Hobi saya adalah " + Hobi);
    System.out.println("Apakah pandai? " + Pandai);
    System.out.println("Jenis Kelamin: " + JenisKelamin);
    System.out.println("Umurku saat ini: " + Umur);
    System.out.println(String.format("Saya beripk %s dengan tingi badan %s", $ipk,tinggi));
    
    

}  
}