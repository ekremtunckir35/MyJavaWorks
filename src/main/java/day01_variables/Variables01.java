package day01_variables;

public class Variables01 {
    //Variable nasil olusturulur
    //  1-Access modifier 2)Data type 3) Variable ismi  4)=    5) deger

    public int age = 13;

    public int height =183;

    //javada Data Type`lari

    /*
        PRIMITIVE DATA TYPES

        * SADECE DEGER VARDIR method yoktur

    1- int --integer kisaltmasidir.Integer tam sayi demektir.  ...32 bit kullanilir
    Matematikte tamsayilarin basi ve sonu yoktur.Fakat java da tamsayilarda basi ve sonu vardir.
    min  int --->  -2,147,483,648
    max int  --->  2,147,483,647

    2-byte : tamsayilar icin kullanilir.  -----8 bit kullanir
             en kucuk ----> -128
             en buyuk ---->  127


    3- short -->tamsayilar icin kullanilir   -----16 bit kullanir
                en kucuk --> -32768
                en buyuk --> 32767

     4- long : tamsayilar icindir.Long int larin yetmedigi yerde kullanilir.  ---->64 bit kullanir.

     5- float : ondalikli sdayilar icindir.Virgulden sonra 7 basamak icerebilir. Fiyatlar icin kulanilr.
                 float degerlerinde sonuna kucuk "f" veya "F" konulur

     6- double : Ondalikli sayilar  ..bilimsel verilerde kullanilr.

     7- boolean : true veya false degerleri icin kullanilir. 1 bit kullanilr
                  0 ise false
                  1 ise true

      8- char : tek karakterler icin kullanilir. -- 16 bit kullanir   .char lara deger verirken deger
                    tek tirnak '' icinde yazilmalidir.

        numerik data types :   byte < short < int < long < float < double
         numerik olmayan  data types ==>  boolean  , char

           NON PRIMITIVE DATA TYPES
       Hem deger hem de   method vardir.

       1-String : isim adres ve kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilr.
                String degerleri mutlaka "" cift tirnak arasina konulmalidir.
                Strin non-primitivedir.Yani bir String olusturdugumuzda java bir suru method verir.
            Primitive ile Non-Primitive  Arasindaki Farklar
      1-Non-primitive data tiplerinde degerin yaninda methodlar vardir.
      2-Primitive data tipleri  java tarafindan olusturulmustur.Toplam 8tanedir.Biz primitive
      data tipleri olusturamayiz.Non-prpimitive data tipleri  sayilamayacak kadar coktur.Cunku her developer
      non-pritive data type olusturacaktir.
      3-Primitive data tipleri isimlendirilirken kucuk harflerle isimlendirilirlerveya kucuk
      harfle baslar.
      Non -primitiv data tipleri buyuk harfle baslar.Neden buyuk harfle baslar.Cunku non primitiveler
       ayni zamanda class tir.Class isimleri buyuk harflew baslar.
       4-Primitve data tipleri memory de farkli buyuklukte yer kaplar.Non-primitive ler memoryde
        ayni buyuklukte yer kaplar.

     */
    public byte price  =12;
    public short populationVillage =23000;
    public  float priceOfShirt =13.99f;
    public  double hucreSayisi =0.0000012450;

    public  long populationOfWord =70000000000L;
    public  long x =1234;

    public  boolean isOld =true;

    public  char initial = 'S';

    public String name = "Tom Hanks";

    public static void main(String[] args) {

    }
}
