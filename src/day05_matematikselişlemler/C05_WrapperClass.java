package day05_matematikselişlemler;

public class C05_WrapperClass {

    public static void main(String[] args) {

        short sayi1=20;

        Short sayi2=30;

        sayi1=sayi2; // Wrapper Class ile aynı isimdeki primitive data türü arasında geçiş olabilir.

        System.out.println(sayi1); // 30

        System.out.println(Short.MAX_VALUE);

        System.out.println(Short.MAX_VALUE);

        System.out.println(Short.BYTES);

    }

}
