package day02methodcreation;

public class MethodCreation {

    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));



    }


    // Examnpe 1 : Toplama islemi  yapan bir metot olusturunuz

    public static double toplamaYap(double a, double b) {
        return a + b;
    }

    public static double ucSayiyiCarp(double a, double b, double c) {
        return a * b * c;

    }


    //Example 3 : uc sayidan ilk ikisini toplayip sonucu ucuncu  ile carpan  method olusturup
    //sonucu ekrana yazdiriniz

    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c) {
        return (a + b) * c;
    }
}

/*
  void ==> bu method yeni bir data uretmiyor demektir.
           orn: ekrana birsey yazdirma methodu
                bir tusa tiklama methodu gibi...
   main ===> methodun ismi
  -- main method ne ise yarar?
     application calistirmaya yarar.Arabanin motoru gibidir.

     --main method icerisnde kullanilacak hersey static olmalidir.

 **Ekrana  yazi yazdirnmmak icin "sout" komutu kullanilir.
    sout==>system.out.println otomatik olarak yazilir.
    println...satirbasi yapar
    print.....satirbasi yapmaz

 */