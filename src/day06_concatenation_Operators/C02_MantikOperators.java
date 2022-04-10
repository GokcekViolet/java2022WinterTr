package day06_concatenation_Operators;

public class C02_MantikOperators {

    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuç1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;//false

        System.out.println(sonuç1);//true

        boolean sonuç2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;//true

        System.out.println(sonuç2);

        boolean sonuç3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;//false

        System.out.println(sonuç3);//false

        // & ile && arasındaki fark

        int sayı3=15;

        // sayi3'ün 10 ile 20 aralığında olduğunu true diyerek döndürelim
        // java 3'lü karşılaştırma kabul etmez
        // ikili karşılştırma yapıp mantıksal oparatörle birleştirmeliyiz.

        int sayi4=5;

        System.out.println(10>sayi4 && sayi4<20);//true

        System.out.println(sayi4<10 || sayi4>20);//true


    }

}
