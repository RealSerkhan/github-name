package app.Enculaption;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of String");
        int sizeString = scanner.nextInt();
        String firstString = "";
        for (int i = 0; i < sizeString; i++) {
            firstString += (char)(Math.random()*('z'-'a'+1)+'a');
        }
        String vowelString = "", consString = "";
        int[] letters = new int[26];
        for (int i = 0; i < sizeString; i++) {
            char indexChar = firstString.charAt(i);
            if(indexChar == 'a' ||
                    indexChar == 'e' ||
                    indexChar == 'i' ||
                    indexChar == 'o' ||
                    indexChar == 'u' ||
                    indexChar == 'y')  vowelString+=indexChar;
            else consString +=indexChar;
            letters[(int)indexChar - 97]++;
        }
        System.out.printf("First string: %s\nVowels string: %s\nConstants string: %s\n",firstString,vowelString,consString);
//        for (int i = 0; i < 26; i++) {
//            System.out.printf("%c   -   %d\n",(char)(i+97),letters[i]);
//        }
    }
}
