package Testsagain;



public class Parantez {

    public int calc(String origin) {
        int calculate=0;

        int max_times=0;
        for (int i = 0; i <origin.length() ; i++) {

            if (origin.charAt(i)=='('){
                calculate++;
            }
            else {


                if (max_times<calculate){
                    max_times=calculate;
                }
                 calculate=0;

            }

        }
        return max_times;
    }

}