package InputOutput;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Fayl {
    public static void main(String[] args) throws IOException {
        File f=new File("file1.txt");
        File fs=new File("file2.txt");
        f.createNewFile();
        fs.createNewFile();
        ArrayList<Integer> randoms = generate(100, -30, 30);
        write(randoms, "file1.txt");
        List<Integer> randoms2 = read("file1.txt");
       List<Integer> sorted_randoms = sort(randoms2);
        write(sorted_randoms, "file2.txt");

    }
        private static ArrayList<Integer> generate ( int i, int i1, int i2){
            ArrayList<Integer> integers = new ArrayList<>();
            Random random = new Random();
            for (int j = 0; j < i; j++) {
                int a = random.nextInt(i2 - (i1)) + (i1);
                integers.add(a);
            }
            return integers;
        }
        private static void write (List < Integer > randoms, String s) throws IOException {
            FileWriter fileWriter = new FileWriter(s);
            fileWriter.write(String.valueOf(randoms));
            fileWriter.close();


        }
    private static List<Integer> read(String name) throws IOException {
        ArrayList<Integer> integers = new ArrayList<>();

        FileReader fr = new FileReader(name);

        int i;
        while ((i=fr.read()) != -1){
            integers.add(i);
        }
        return integers;

    }



        private static List<Integer> sort (List < Integer > randoms2) {
            Collections.sort(randoms2);
            return randoms2;
        }
}
