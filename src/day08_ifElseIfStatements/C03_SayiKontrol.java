package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {

        //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki sayıyı giriniz.");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        //sayıların ikiside pozitif ise sayıların toplamını yazdırın

        if (sayi1>0 && sayi2>0) {
            System.out.println("Girdiğiniz sayıların ikiside pozitif olduğundan sayıların toplamı = " +
                    (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("Girdiğiniz sayıların ikiside negatif olduğundan sayıların çarpımı = " +
                    (sayi1*sayi2));
        } else {
            System.out.println("0 çarpmıya göre yutan elemandır.");
        }


    }

}
