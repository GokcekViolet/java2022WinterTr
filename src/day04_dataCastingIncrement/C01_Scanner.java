package day04_dataCastingIncrement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //kullanıcının ismini alıp başharfini yazdırın.
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz.");

        char ilkHarf = scan.next().charAt(0);
        //charAT(index) method'u paremetre olarak yazdığımız indexdeki char'ı bize getirir.
        //String de index 0'dan başlar.

        System.out.println("Girdiğiniz ismin ilk harfi : " + ilkHarf);



    }
}
