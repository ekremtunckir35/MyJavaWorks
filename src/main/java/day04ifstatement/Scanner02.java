package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

//Example 1 :Kulllanicidan ilk ve soy ismini aliniz.Ilk ve soy isminin ilk
        //harflerini ekrana yazdiriniz
        //kullanicidan Ali Can alip ekrana AC yazdirilacak

      /*
       //1.yol
        Scanner input =new Scanner(System.in);
        System.out.println("ilk ismi giriniz");
        char ilk =input.next().charAt(0);//A

        System.out.println("soy isminizi giriniz");
        char son = input.next().charAt(0);//C
        System.out.println("" +ilk + son);

       */
/* Javada + isaretinin iki anlami vardir
  1. anlami toplama
  2.anlami birlestirme (concatenation)
  once toplamiyi dener toplama yapamazsa birlestirme yapar.
 ** CHAR variableri matematiksel islemlerlde kullanilirsa,Java  onlarin ASCII
 degerlerini kullanir.Ornegin
  System.out.println ('A' + 'C') ekrana AC yerine 132 yazdirir.

 */
        //2.yol
        System.out.println("Tam isminizi giriniz");
        Scanner input= new Scanner(System.in);
        String tamIsim = input.nextLine();//Ali Can
        char ilkHarf=tamIsim.charAt(0);
        System.out.println(ilkHarf);//Ali Can



        char soyIsminIlkHarfi = tamIsim.split("")[1].charAt(0);
        System.out.println((soyIsminIlkHarfi));

    }
}
