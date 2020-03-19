package Testsagain;


public class Parantez {

    public int calc(String origin) {
        int current = 0;
        int max = 0;
        for (int i = 0; i <origin.length(); i++) {


            if (origin.charAt(i) == '(') {
                current++;
            }

            else {
                if (max<current){
                    max=current;
                }

                current = 0;
            }


        }


        return max;
}
}

