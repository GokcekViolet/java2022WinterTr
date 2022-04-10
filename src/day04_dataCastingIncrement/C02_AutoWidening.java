package day04_dataCastingIncrement;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu = true;
        //String str = dogruMu; // sol String,sağ boolean olunca kabul etmez.


        byte sayi1 = 44;

        System.out.println(sayi1);//44

        short sayi2 = sayi1; //eşitliğin solu short sağı ise byte olmasına rağmen java itiraz etmez.
                             //değer olarak atanan data türü variable data türünden küçük olduğu için sorun olmaz.
        System.out.println(sayi2);//44

        double sayi3 = sayi2;//44

        System.out.println(sayi3);
    }
}
