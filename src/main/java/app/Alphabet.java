package app;

public class Alphabet {
    public static void main(String[] args) {
        char chars;
        StringBuilder b = new StringBuilder();
        for(chars = 'A'; chars <= 'Z'; ++chars)
           b.append(chars);

        System.out.println(b);
    }
}