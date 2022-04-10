package day15_methodCreation;

public class C05_MethodCreation {

    public static void main(String[] args) {

            String str="Ali";

            C04.ucHarfiTersineCevir(str);

            str="Java";

            C04.dortHarfiTersineCevir(str);

           tersineCevir("qwerty");

        System.out.println(tersineCevirReturn("QWERTY"));

        String newStr = tersineCevirReturn("Alo oyuna kalk.");
        System.out.println(newStr);

    }
        public static void tersineCevir(String kelime) {

        String tersKelime="";
        for (int i = kelime.length()-1; i >=0; i--){
            tersKelime=tersKelime+kelime.charAt(i);
        }
            System.out.println(tersKelime);
        }

        public static String tersineCevirReturn(String kelime1){
            String terskelime1 = "";
            for (int i =kelime1.length()-1; i >=0; i--) {
                terskelime1=terskelime1+kelime1.charAt(i);
            }
            return terskelime1;
        }

}

;