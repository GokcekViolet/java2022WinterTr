package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        // Girilen bir karakterin harf olup olmadığını bulalım.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz.");

        char karakter = scan.nextLine().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z' || karakter >= 'a' && karakter <= 'z'  ){

            System.out.println("Girdiğiniz karakter harf ");
        } else {
            System.out.println("Girdiğiniz karakter harf değil");
        }

    }

}
