package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin
        int s = 12;

        if (s > 0) {
            System.out.println("pozitive");
            //Example 2: Verilen karakten buyuk harf ise ekrana buyuk harf yazdirin

            char ch = 'E';
            if(ch>='A' && ch<='Z'){
                System.out.println("Buyuk Harf");
            }


        }
        //Example 3 : verlien bir sayi 3 basamakli ise ekrana 3 basamakli yazdiriniz.
        int n =-1234;
        n=Math.abs(n);//abs sayiyi pozitife cevirir
        if(n>=99 && n<1000){
            System.out.println("uc basamakli");
        }

        //Example 4 :verilen bir sayi cift ise ekrana cift sayi yazdiriniz

        int t =-14;
        t = Math.abs(t);

        if(t%2==0){
            System.out.println("cift sayi");
        }
        //Example 5: verilen bir sayi 300 den kucuk  veya 1200 den buyuk ise ekrana
        //  "HARIKA SAYI" yazdiriniz

        int r =250;
        if(r<300 || r>1200){
            System.out.println("HARIKA SAYI");

        }
    }
}
  /*
  --if statement belli kodlari belli sartlara bagli olarak calistirmaqya yarar.
&& and islemi==>sadece boolean ile kullanilir. And isleminde true olmasi icin
hepsinin true olmasi gerekir.Bir tanesi false olursa  sonuc false olur
      true && true --->true
      true && false--->false
      false && false-->false
      false && false---> false

"||" ---> veya ISLEMINDE
sadece boolean ile kullanilir.
SADECE BIR TANE TRUE VARSA  SONUC TRUE,BIR TANE FALSE  OLURSA SONUC FALSE OLUR.
      true || true ---> true
      true || false---> true
      false || false-->false
      false || true -->true
  || veya da
 "=" esittir isareti ---> atama operatorudur.Matematikteki esittr anlamina gelmez.
 Matematikteki esittir sembolu Java da "==" seklindedir.
 orn = 2 +3 == 5
   */