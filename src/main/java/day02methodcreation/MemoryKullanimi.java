package day02methodcreation;

public class MemoryKullanimi {
    public static void main(String[] args) {



    }
}


/*
        JAVADA 2 tane memory kullanimi var

      1-Heap Memory ==>non-primitive datalar konur.
             String, Olusturdugumuz classlar

      2-Stack Memory===> primitive datalar konulabilir.Kucuk memorydir
                         primitive ve non-primitive adreslerini icerir.
                         byte,short,int,long,float,double,boolean,char
     Java heap memory ye yerlestirilen  her non-primitive  data icin bir adress
     olusturur.Bu adresi stack memory koyar.
     Herhangi bir sebeple adres silinirse,java adresi olmayan heap daki non-primitive  datayi
     otomatik olarak siler.Memory temizligini saglayan "Garbage Collector" vardir.
 */