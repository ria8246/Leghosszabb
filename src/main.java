class HelloWorldApp {
    //AABBBCCCCDD  --> CCCC


    public static void main(String[] args) {

        //String str = "AABBBCCCCDD";
        String str = "AABBBCCCCDDXDDDDDNJKLLLLLL";


        int i = 0;
        int j =0;
        char leggyakoribb_ch ='x';
        char tempLeghosszabb_ch ;//= str.toUpperCase().charAt(0);
        int leghosszabb_max = 0;
        int tempLeghosszabb_num = 0;


        while (i < str.length()) {
            tempLeghosszabb_ch = str.toUpperCase().charAt(i);
            tempLeghosszabb_num =0;
            while (j < str.length() && tempLeghosszabb_ch == str.toUpperCase().charAt(j)) {
                j++;
                tempLeghosszabb_num++;
            }

            if(tempLeghosszabb_num >= leghosszabb_max){
                leghosszabb_max = tempLeghosszabb_num;
                leggyakoribb_ch = tempLeghosszabb_ch ;
            }
            i++;
        }

        System.out.println("leghosszabb_max: " + leghosszabb_max);
        System.out.println("tmp: " + leggyakoribb_ch);

    }
}