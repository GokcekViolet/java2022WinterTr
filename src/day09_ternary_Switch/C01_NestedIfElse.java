package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {

    public static void main(String[] args) {

//        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
//        bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
//        çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
//        Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz.");

        int sayi = scan.nextInt();

        if (sayi<1000 || sayi>9999) {//istenmiyen durumu yazıyoruz.
            System.out.println("Lütfen 4 basamaklı sayı giriniz.");
        } else if (sayi%5==0) {//sayı 5 e tam bölünüyor.

            if (sayi%10==0){//4 basamaklı 5 ile bölünebilen ve son rakamı 0 olan
                System.out.println("5'e bölünen çift sayı");
            } else {        //4 basamaklı 5 ile bölünebilen ve son rakamı 0 olmıyan
                System.out.println("5'e bölünen tek sayı");
            }

        } else System.out.println("Tekrar deneyin"); // 4 basamaklı ve 5 e bölünemiyor.

    }

}
