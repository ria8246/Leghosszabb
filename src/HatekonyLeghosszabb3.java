/**
 * Created by Ria on 2017.02.26..
 */
public class HatekonyLeghosszabb3 {
    private static int numOfCompers =0;
    private static boolean compare(char l, char r){
        System.out.println("comparing..." );
        System.out.println(l + " ==? " + r);
        System.out.println((l == r));
        numOfCompers++;
        return l == r;
    }
    public static void main(String[] args) {
        String str = null;
        if (args.length == 0) {
            //str = "AABBBCCCCDDXDDDDDNJKLLLLLL";
            //str = "AABBBCCCCDD";
            //str = "AABBBCCCC";
            str = "almafaa";
        }else {
            str = args[0];
        }
        int index = 1;
        char leggyakoribb_ch ='x';
        int leghosszabb_max = 0;
        int tempLeghosszabb_num = 1;
        char s = str.toUpperCase().charAt(0);

        while (index < str.length() ) {
            if (compare(s, str.toUpperCase().charAt(index))) {
                System.out.println(">>> MATCH FOUND <<<");
                index++;
                tempLeghosszabb_num++;
                System.out.println("tempLeghosszabb_num= " + tempLeghosszabb_num);
                System.out.println("---------------------------");
            }else {
                System.out.println(">>> NO MATCH FOUND <<<");
                index++;
                s = str.toUpperCase().charAt(index-1);
                System.out.println("s:" + s);
                tempLeghosszabb_num = 1;
            }
            if(tempLeghosszabb_num >= leghosszabb_max){
                leghosszabb_max = tempLeghosszabb_num;
                leggyakoribb_ch = str.toUpperCase().charAt(index-1) ;
            }
        }
        System.out.println("leghosszabban előforduló karakter: " + leggyakoribb_ch + " (" + leghosszabb_max + " db)");
        System.out.println("Összehasonlítások száma: " + numOfCompers);
    }
}



