package day07_ifElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a==b) {
            System.out.println("verilen sayılar eşit.");
        }
        if (a>100) {
            System.out.println("a 100'den büyük.");
        }
        if (a*b>5) {
            System.out.println("sayıların çarpımı 5 den büyük.");
        }
        // bağımsız if cümleleri kendileri dışındaki kodlarla ilgilenmez,
        // 1 şart ve o şarta bağlı odaklıdır.
        // 1'den fazla if cümlesi olduğunda hepsinin bodysi çalışabileceği gibi
        // hiçbirinin body'si de çalışmayabilir.

    }

}
