package day04_dataCastingIncrement;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1 = 8;
        int sayi2 = 4;

        System.out.println(sayi1/sayi2); //2

        sayi2 = 3;

        System.out.println(sayi1/sayi2); // 2.666666666666 = 2

        sayi1 =22;

        System.out.println(sayi1/sayi2); // 7.333333333333 = 7

        //javada 2 int sayı birbirine bölünürse sonuç da int olur.
        //eğer virgülden sonra küsürat varsa siler.

        sayi1 = 4786;
        sayi2 = 10;

        sayi1 = sayi1/sayi2; //478.6

        System.out.println(sayi1);//478

        sayi1 = sayi1/sayi2;

        System.out.println(sayi1); // 47

        sayi1 = sayi1/sayi2;

        System.out.println(sayi1); // 4

        sayi1 = sayi1/sayi2;

        System.out.println(sayi1);

        sayi1 =4895;
        double sayi3 = 10;
       // sayi1=sayi1/sayi3; //iki farklı data türünü işleme koyduğumuzda
                           //java küçük olan data türü için AutoWidening yapar.
                           //bu işlemi düşünürsek sayi1/sayi3 işleminin sonucunu double kabul eder.

        System.out.println(sayi1/sayi3); // 489.5

        System.out.println(sayi3/ sayi1);// 0.0020429009193054137


    }

}
