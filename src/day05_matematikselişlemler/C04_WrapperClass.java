package day05_matematikselişlemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data türü ile non-primitive arasındaki farklar nelerdir?

        String str= "Java";
        int sayi= 10;

        System.out.println(str.toUpperCase(Locale.ROOT));

        System.out.println(str);

        //non-primitive data türleri depolamanın yanında birçok faydalı methoda sahiptir
        //ancak primitive data türlerinin böyle bir özelliği yoktur
        //primitive data türleri yalnızca değerlerini saklarlar(container)

        //primitive data türleri için de bazı methodlar gerekli olduğunda
        //java ara bir çözüm üretmiştir
        //java her bir primitive data türünü,non-primitive olarak kullanabilmek için
        //özel classlar oluşturmuş ve bunlara  Wrapper Class ismini vermiştir.

        double sayi2=20.5;

        // sayi2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        Double sayi3=15.2;

        // sayi3 wrapper Class olan Double class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir.

    }
}
