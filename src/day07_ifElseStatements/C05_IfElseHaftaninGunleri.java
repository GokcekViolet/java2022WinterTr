package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ==> hafta sonu
        // değilse ==> hafta içi

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen gün ismi yazınız.");

        String günIsmı = scan.nextLine().toUpperCase(Locale.ROOT);

        if (günIsmı.equals("PAZAR") || günIsmı.equals("CUMARTESİ")) {
            System.out.println("Girdiğiniz gün haftasonu");
        } else {
            System.out.println("Girdiğiniz gün haftaiçi");
        }
    }

}
