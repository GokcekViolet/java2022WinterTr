package day04_dataCastingIncrement;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 879;
        double sayi2 = 10;

        double sayi3 = sayi1/sayi2; // 87.9
        System.out.println(sayi3);

        int sayi4 =(int) (sayi1/sayi2); // 87.9
                                // değer double , variable int
                                // yani variable daha dar , dolayısıyla java bunu otamatik olarak yapmaz.
                                // sorumluluğu üstlenmenizi ister.
                                // sağ tarafa yazdığım (int) sorumluluk bende demek.

        System.out.println(sayi4); // 87

        int sayi5 = 129;
        byte sayi6 = (byte) sayi5; //sağ tarafda ki değer int > sol taraftaki variable byte

        System.out.println(sayi6); // -127










    }
}
