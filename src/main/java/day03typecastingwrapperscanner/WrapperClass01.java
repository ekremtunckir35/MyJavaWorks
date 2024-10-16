package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        //Exampe 1: byte data tipinin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.





        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128
        //Exampe2: short,int,long data tiplerinin en buyuk ve en kucuk degerlerini
        //ekrana yazdiriniz.
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //pRIMITIVELER NASIL WRAPPAR YAPILIR

        float f1 =13.99F;
        Float wrapperF1=f1; ////autoboxing

//wrapper primitive nasil cevrilir//unboxing

        Character w1 ='s';
        char primitiveW1 =w1;
//autoboxing ve unboxing java tarafindan otomatik  olarak cevrilir.
    }
}




//WrapperClass ==> primitivlere metot eklenirse wrapper class olur.
//non-primitive dir

/*
primitive .....deger var
non primitive...hem deger hem metot var
Java prpimitivlere metotlar ekleyerek yeni bir yapi olusturdu.Bu yapiya wrapper class

primitive          WrapperClass
byte      ==>       Byte
int                 Integer
short               Short
long      ==>       Long
float               Float
double              Double
boolean             Boolean
char                Char
primitebyte yazildiginda nokta koydugunuzdamethod gorulmez.
Cunku primitive ler method icermez sadece deger icerir.

wrapperByte yazip nokta koydugunuzda bircok method gorulur.Cunku
wrapper class method icerir
PRIMITIVELER NASIL WRAPPER CEVRILIR
 */