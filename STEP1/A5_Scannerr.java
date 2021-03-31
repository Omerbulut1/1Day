package STEP1;
    import java.util.Scanner;

public class A5_Scannerr {
    public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    String Ad, Soyad;
    Double Yas;
        System.out.println("isminizi giriniz");
        Ad=input.next();
        System.out.println("Soyadinizi Giriniz");
        Soyad=input.next();
        System.out.println("Yasinizi Giriniz");
        Yas=input.nextDouble();// Double karekteri , ile calisir . ile calismaz.

        System.out.println("Adiniz=" + Ad);
        System.out.println("Soyadiniz=" + Soyad);
        System.out.println("Yasiniz=" + Yas);




    }
}
