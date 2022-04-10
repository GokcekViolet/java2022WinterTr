package day09_ternary_Switch;

public class C04_NestedTernary {

    public static void main(String[] args) {

        // verilen sayının pozitif mi negatif mi sayı olduğunu kontrol edip
        // 0 veya pozitif sayı ise tek veya çift
        // negatif sayı ise -100 den büyük veya küçük
        // olduğunu belirleyen bir ternary yazınız.

        int sayi=0;

        if (sayi>=0) {

            if (sayi%2==0) {
                System.out.println("sayı pozitif çift sayı");
            } else {
                System.out.println("sayı pozitif tek sayı");
            }
        } else {
                if (sayi<-100) {
                    System.out.println("Sayı -100 den küçük negatif sayı");
                }else {
                    System.out.println("Sayı -100 den büyük negatif sayı");
                }
        }
                String sonuc= sayi>=0 ? (sayi%2==0 ? "pozitif çift sayı" : "pozitif tek sayı") :
                                        (sayi<-100 ? "-100 den küçük negatif sayı" : "-100 den büyük negatif sayı");

        System.out.println(sonuc);
    }

}
