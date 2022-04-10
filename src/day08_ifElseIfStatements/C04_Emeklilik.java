package day08_ifElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Emeklilik {

    public static void main(String[] args) {

        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        //calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz." + "\nKadın için K,\nErkek için E");

        char cinsiyet = scan.next().toUpperCase(Locale.ROOT).charAt(0);

        System.out.println("Lütfen yaşınızı giriniz.");

        double yaş = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yaş < 0 || yaş > 120) {
                System.out.println("Lütfen girdiğiniz yaş değerini kontrol edin.");
            } else if (yaş < 60) {
                System.out.println("emekli olamazsın daha " + (60 - yaş) + " Yıl çalışman gerekir");
            } else {
                System.out.println("Emekli olabilirsin.");
            }
        } else if (cinsiyet == 'E') {
            if (yaş < 0 || yaş > 120) {
                System.out.println("Lütfen girdiğiniz yaş değerini kontrol edin.");
            } else if (yaş < 65) {
                System.out.println("emekli olamazsın daha " + (65 - yaş) + " Yıl çalışman gerekir");
            } else {
                System.out.println("Emekli olabilirsin.");
            }
        } else {
            System.out.println("Lütfen geçerli bir harf giriniz.");
        }

    }

}