package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ==> hafta sonu
        // değilse ==> hafta içi

        // String case sensitive'dir.
        // Yani PAZAR,Pazar, Gibi büyük küçük harfleri farklı algılar.

        // Bu durumda ya toUpperCase ya da toLowerCase kullanırız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen gün ismi yazınız.");

        String günIsmı = scan.nextLine().toLowerCase(Locale.ROOT);// kullanıcı nasıl yazarsa yazsın küçük harf olur.

        if (günIsmı.equals("pazar") || günIsmı.equals("cumartesi")) {
            System.out.println("Girdiğiniz gün haftasonu");
        }
        if (günIsmı.equals("pazartesi") || günIsmı.equals("salı") || günIsmı.equals("çarşamba")
            || günIsmı.equals("perşembe") || günIsmı.equals("cuma")) {
            System.out.println("Girdiğiniz gün hafta içi");
        }

    }

}
