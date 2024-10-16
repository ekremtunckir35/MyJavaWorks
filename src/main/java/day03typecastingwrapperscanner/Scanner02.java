package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example : Sayilari kullanicidan alan ve toplami islemi yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayi sayiyi giriniz");
        double sayi1= input.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 =input.nextDouble();
        System.out.println(sayi1+sayi2);

    }
}
