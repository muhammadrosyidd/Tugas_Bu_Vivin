import java.util.Scanner;

public class Kubus_23 {

    static int hitungVolume(int s) {
        int volume = 3 * s;
        return volume;
    }

    static int hitungLuasPermukaan(int s) {
        int luasPermukaan = 6 * s;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, volume, luasPermukaan;
        System.out.print("Masukkan panjang sisi: ");
        s = sc.nextInt();
        volume = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + volume);
        luasPermukaan = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
    }
}
