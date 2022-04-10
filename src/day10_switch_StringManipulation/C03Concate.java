package day10_switch_StringManipulation;

public class C03Concate {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Candır";

        // Java Candır yazdıralım.

        System.out.println(str1 + " " + str2);

        String cümle=str1.concat(str2);//JavaCandır.

        cümle=str1.concat(" ").concat(str2);

        System.out.println(cümle);

    }

}
