package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //Ternary ile yapılan tüm işlemler if else ile yapılabilir.
        //İf else yerine ternary tercih etme sebebi yapının basit ve anlaşılabilir olmasıdır.
        //Ternary içerisinde kompleks kodlar olmaz
        //sadece sonuç veya bizi sonuca götüran basit işlemler olabilir.

        //kullanıcıdan bir tamsayı alıp tek mi çift mi yazdıran bir kod yazalım.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayı giriniz.");

        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Sayı çift");
        } else System.out.println("Sayı tek");

        System.out.println(sayi%2==0 ? "Sayı çift" : "Sayı tek");

    }
}
