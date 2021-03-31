package STEP1;

public class A4_Str_Ch_Bo {
    public static void main(String[] args) {
        String kelime_1, kelime_2;
        kelime_1= "Merhaba";
        kelime_2= "Dunya";
        System.out.println(kelime_1 + kelime_2); //iki kelimeyi ayirmak icin
        System.out.println(kelime_1+ " " + kelime_2);

        String kelime_3;
        kelime_3= kelime_1.substring(3);
        System.out.println("substringli sonuc=  " + kelime_3);// aynisi alt satirla
        System.out.println(kelime_1.substring(3));  // ust satirla ayni
        String isim, soyisim, basharfler;
        isim = "Ahmet"; soyisim= "AHMET";
        basharfler = isim.substring(0,1) +" " + soyisim.substring(0,2); //0 ilk harfe larsilik gelir
        System.out.println("Sadece Bas Harfler=" + basharfler );

        System.out.println(isim.equals(soyisim)); //SOUT icine yazarsin.
        System.out.println(isim.equalsIgnoreCase(soyisim));// ignore buyuk kucuk onemini yitirtir.

        String isim_1, isim_2, isim_3;
        isim_1= "kasim";
        isim_2= "enes";
        isim_3= "ENES";
        System.out.println(isim_1.compareTo(isim_2));

        System.out.println(isim_2.compareTo(isim_3)); //BUYUK KUCUK HARFLERIN DEGERI FARKLI BUYUK ONCE GLR.
        System.out.println(isim_2.compareToIgnoreCase(isim_3));

        String isim_4;
        isim_4= isim_1.toUpperCase();
        System.out.println("buyuk harfli hali=" + isim_4);
        String isim_5;
        isim_5= isim_4.toLowerCase();
        System.out.println("Yeniden Kuculmus Hali=" + isim_5);



    }
}
