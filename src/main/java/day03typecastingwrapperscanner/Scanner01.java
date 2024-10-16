package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan data almak icin yapilmasi gerekenler;

        //1.Adim : Scanner class indan object olusturun

        Scanner input =new Scanner(System.in);

        //2.Adim: Kullaniciya ne yapacagini soyle
        System.out.println("Lutfen yasinizi giriniz.");

        //3.Adim: Kullanicidan aldiginiz datayi bir variable nin icine koyun

        byte age = input.nextByte();

        System.out.println("Senin yasin" + age);

    }
}



/*
Scanner disaridaki datayi benim kodumun icine tasir.
Scanner kullanicidan data almaya yarar.
Scanner bir java Class idir.Bu class i kullanabilmek icin import etmek gerekir.
Scanner class javanin util kutuphanrsindedir.
 */