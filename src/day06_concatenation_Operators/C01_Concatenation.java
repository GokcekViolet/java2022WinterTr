package day06_concatenation_Operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzel";

        int sayi1=5;
        int sayi2=3;

        //variablelerin değerlerini değiştirmeden
        //aşşağıdaki ifadeleri yazdır.

        //Java5Güzel

        System.out.println(str1+sayi1+str2);

        //2Güzel15

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java23

        System.out.println(str1+((sayi1*sayi2)+(sayi1+sayi2)));

        //53Güzel

        System.out.println(""+sayi1+sayi2+str2);

        /*eğer tamamen sayılardan oluşan bir string varsa ve biz bunu int çevirmek istersek
          Integer.valueOf(str)

          bir sayıyı String'e çevirmek istersek,
          ""+sayi1+sayi2 olarak yazdırırız.

         */




    }
}
