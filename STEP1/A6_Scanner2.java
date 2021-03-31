package STEP1;
import java.util.Scanner;
public class A6_Scanner2 {
    public static void main(String[]Args) {
        Scanner input = new Scanner(System.in);
        Double Sayi_1, Sayi_2, SonucB, SonucC, SonucT, SonucM;
        System.out.println("Ilk Sayiyi Giriniz");
        Sayi_1 = input.nextDouble();
        System.out.println("Ikinci Sayiyi Giriniz");
        Sayi_2 = input.nextDouble();
        SonucT = Sayi_1 + Sayi_2;
        SonucB = Sayi_1 / Sayi_2;
        SonucC = Sayi_1 * Sayi_2;
        SonucM = Sayi_1 % Sayi_2;
        System.out.println("Toplam Sonucu" + SonucT);
        System.out.println("Bolme Sonucu=" + SonucB);
        System.out.println("Carpma Sonucu=" + SonucC);
        System.out.println("Mod Sonucu=" + SonucM);

    }
}




