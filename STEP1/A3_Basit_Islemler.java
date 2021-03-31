package STEP1;

public class A3_Basit_Islemler {
    public static void main(String[] args) {
        int sayi_1, sayi_2;

        double sayi_3, sonuc;
        sayi_1= 6;
        sayi_2= 20;
        sayi_3= 2.8;
        sonuc= sayi_1+sayi_2;
        System.out.println("ilk Sonuc=" + sonuc);

        sonuc=sayi_1-sayi_2;
        System.out.println("ikinci Sonuc=" + sonuc);

        sonuc=sayi_1%sayi_2;
        System.out.println("ucuncu Sonuc=" + sonuc); //yuzde isareti modu alir

        sonuc=sayi_1+sayi_2+sayi_3;
        System.out.println("dorduncu Sonuc=" + sonuc);

        sonuc=sayi_2/sayi_1;
        System.out.println("besinci Sonuc=" + sonuc); // eger double sayiya 5.0 demezsen sonuc double olsa
        //bile tam islem sonucu cikmaz
        double Sayi_1=6.0, Sayi_2=20;
        sonuc= Sayi_2/Sayi_1;
        System.out.println("altinci Sonuc=" + sonuc);


    }

}
