package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {

        //kullanıcıdan yaşını isteyin.
        // 65 ya da daha büyükse emekli olabilirsin
        // 65 den küçükse emekli olamazsın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz.");

        int yaş=scan.nextInt();

        if (yaş>=65) {
            System.out.println("emekli olabilirsin :)");
        } else {
            System.out.println("emekli olamazsın :(");
            System.out.println(65-yaş + " sene daha çalışmalısın");
        }

        // if-else statement'larda iki durumdan sadece birisi çalışır.
        // ikisinin birden çalışma ihtimali yok!
        // ikisininde çalışmama ihtimali de yok.

    }

}
