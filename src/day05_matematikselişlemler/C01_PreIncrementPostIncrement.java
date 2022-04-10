package day05_matematikselişlemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi1 = 10;

        sayi1++;

        System.out.println(sayi1); // 11

        sayi1++;

        System.out.println(sayi1); // 12
        // eğer 11. ve 15. satırda yaptığım 2 işlemi tek satırda yaparsam
        // java 2 işlemden önce hangisini yapacağını bilmek ister.
        // önce arttırır sonra yazdırırsak java yeni değeri yazdırır.
        // ama önce yazdırır sonra arttırırsak , bu durumda eski değer yazdırır.

        System.out.println("pre increment satırında   " + ++sayi1);//12+1 sonra yazdır

        System.out.println("pre increment den sonra  " + sayi1);//13

        System.out.println("post increment satırında  " + sayi1++);//13 önce yazdır sonra arttır.

        System.out.println("post increment dan sonra  " + sayi1);//14



    }

}
