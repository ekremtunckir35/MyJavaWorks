package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        //Example 1:
        // Kullanicidan isim, orta isim ve soyisim ve kimlik numarasini aliniz
        //isim Ali Mert Can
        //kimlik no 123456789 seklinde
        //isim ust kimlik no alt satira gelecek yaziniz

        // next() ile nextline() farki?
        // next()    ==> Kullanicidan gelen String in sadece ilk kelimesini alir
        //nextline()==>Kullanicidan gelen String in tamamini alir


        //1.yol
        Scanner input =new Scanner(System.in);

        System.out.println("ilk isminizi giriniz...");

        String ilkIsim = input.next();
        //next methodu kullanicidan String almak icin kullanilir.

        System.out.println("Orta isminizi giriniz");
        String ortaIsim = input.next();

        System.out.println("soy isminizi giriniz");
        String  soyIsim = input.next();

        System.out.println("kimlik numaranizi giriniz");
        String kimlikNo =input.next();

        System.out.println( ilkIsim + " " + ortaIsim + " Ali" +
                "" + soyIsim );
        System.out.println(kimlikNo);

        //2.yol
        System.out.println("ilkorta,soy isminizi ve kimlik numaranizi giriniz");
        String ilk = input.next();
        String orta =input.next();
        String soy =input.next();
        String kimlik= input.next();
        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);



        //3.yol
        System.out.println("Ilk,orta ve soy isminizi giriniz");
        String tamIsim =input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numarasini giriniz");;
        String kimlikNumarasi =input.next();
        System.out.println(kimlikNumarasi);











    }
}


