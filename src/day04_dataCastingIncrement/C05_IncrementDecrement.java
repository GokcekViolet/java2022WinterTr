package day04_dataCastingIncrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi1 = 20;

        System.out.println(sayi1+10); //30

        System.out.println(sayi1); // 20

        //eğer atama yapmazsak sayıda yaptığımız arttırma veya azaltma kalıcı olmaz.

        sayi1 = sayi1+10;

        System.out.println(sayi1);

        // bir variablenin değerini kalıcı olarak arttırmak istersek assigment şart!

        System.out.println(sayi1++);
        System.out.println(sayi1);
    }
}
