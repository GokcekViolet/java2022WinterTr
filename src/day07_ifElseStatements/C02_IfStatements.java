package day07_ifElseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100) {
            System.out.println("istediğiniz gerçeklesecek");
            System.out.println("budy içindeki tüm kodlar çalısır.");
        }

        if (a<0) System.out.println("süslü parantez olmazsa sadece bir satır çalışır.");

        // bir if cümlesinin daha anlaşılır olmasını istiyorsanız
        // if bodysini {} içine yazmalısınız
        // body'yi {} içine yazmassak da if cümlesi çalısır.
        // ancak ilk ; gördüğünnde if cümlesi bitmiştir

        // alttaki satır 15. satırdaki if den bağımsızdır.
        System.out.println("2. satır çalıştı.");
    }

}
