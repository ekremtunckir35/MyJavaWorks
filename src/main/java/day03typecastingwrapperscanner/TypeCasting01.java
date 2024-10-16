package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {
        byte age = 23;
        int newAge= age;

        long population = 1234;
        int newPopulation =(int)population;

        //example 1: shortu dounble ceviren  kodu yaziniz
        short numOfStudents = 235;
        double newNumOfStudent = numOfStudents; //auto widening

        //Example 2: float i byte yapan kodu yaziniz

        float price =12.99f;
        byte newPrice= (byte)price;  //explicit narrowing
        System.out.println(price);//12
        //java ondalik sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz.
        //java ondalik sayiyi tam sayiya cevirirken ondalik kismini siler.

        int number =515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);//3

        int num =510;
        byte newNum =(byte)num;
        System.out.println(newNum);//-2


    }
}







//Type Casting: Bir numerik data tipini diger numerik data tipine cevirmek demektir.
//numerik data tipleri : byte < short < int < long < float < double

// auto widening==> kucuk data tipinin buyuk data tipine cevirmektir.
//                   kucukten buyuge dogru
//explicit nerowing===> daraltma
// buyuk data tipinin kucuk data tipine cevirmeye denir.