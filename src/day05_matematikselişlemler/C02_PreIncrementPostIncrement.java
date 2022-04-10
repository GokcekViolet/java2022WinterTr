package day05_matematikselişlemler;

public class C02_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi1 = 10;

        int sayi2 = 20;

        int sayi3 = 30;

        sayi2 = sayi1++;

        System.out.println(sayi1 +","+ sayi2 +","+sayi3);//11,10,30

        sayi3=++sayi1;

        System.out.println(sayi1 +","+ sayi2 +","+sayi3);//12,10,12

        System.out.println(--sayi2);//önce azalt sonra yazdır.
                                    //önce sayi2=9 sonra sayi2 nin son değerini yazdır.Yani 9 yazdırır.



    }
}
