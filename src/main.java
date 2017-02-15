class HelloWorldApp {
    //AABBBCCCCDD  --> CCCC


    public static void main(String[] args) {
        //String str = "AABBBCCCCDD";
        String str = null;
        if (args.length == 0) {
            ///str = "AABBBCCCCDDXDDDDDNJKLLLLLL";
            str = "AABBBCCCCDD";
        }else {
            str = args[0];
        }

        int i = 0;
        int j =0;
        char leggyakoribb_ch ='x';
        char tempLeghosszabb_ch ;//= str.toUpperCase().charAt(0);
        int leghosszabb_max = 0;
        int tempLeghosszabb_num = 0;

        int counter =0;

        while (i < str.length()) {
            tempLeghosszabb_ch = str.toUpperCase().charAt(i);
            tempLeghosszabb_num =0;

            System.out.println("[i="+ i + "]");
            System.out.println("[tempLeghosszabb_ch=" + tempLeghosszabb_ch + "]");

            while (j < str.length() && tempLeghosszabb_ch == str.toUpperCase().charAt(j)) {
                System.out.println("[[i="+ i + "]]");
                System.out.println("[[j="+ j + "]]");
                System.out.println("[[tempLeghosszabb_ch=" + tempLeghosszabb_ch + "]]");
                System.out.println("[[str.toUpperCase().charAt(j)="+ str.toUpperCase().charAt(j) + "]]");
                System.out.println("==========");

                j++;
                tempLeghosszabb_num++;
                counter++;
            }

            if(tempLeghosszabb_num >= leghosszabb_max){
                leghosszabb_max = tempLeghosszabb_num;
                leggyakoribb_ch = tempLeghosszabb_ch ;
            }
            i++;
            counter++;
        }

        System.out.println("Karakter összehasonlítások száma_: " + i);
        System.out.println("leghosszabb_max: " + leghosszabb_max);
        System.out.println("leghosszabb: " + leggyakoribb_ch);
        System.out.println("j="+ j);
        System.out.println("i="+ i);
        System.out.println("counter="+ counter);

    }
}