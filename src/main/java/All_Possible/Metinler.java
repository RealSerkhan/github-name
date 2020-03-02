package All_Possible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Metinler {
    private static Object List;

    public static void main(String[] args) {
        List<String> subjects = asList("Noel", "The cat", "The dog");
        List<String> verbs = asList("wrote", "chased", "slept on");
        List<String> objects = asList("the book", "the ball", "the bed");
        List<String> sentences = all_possible(subjects, verbs, objects);
        for (String a:sentences){
            System.out.println(a);
        }



















//        for (int i = 0; i < 3; i++) {
//            umumi.add(subjects.get(i));
//
//            for (int j = 0; j < 3; j++) {
//                umumi.add(verbs.get(j));
//                for (int k = 0; k < 3; k++) {
//                    umumi.add(objects.get(k));
//                    System.out.println(umumi);
//                    umumi.remove(objects.get(k));
//                }
//                umumi.remove(verbs.get(j));
//            }
//            umumi.remove(subjects.get(i));
//        }

    }

    private static List<String> all_possible(List<String> subjects, List<String> verbs, List<String> objects) {
        List<String>all=new ArrayList<>();

        for (String subjects1:subjects){
            for (String verbs1:verbs){
                for (String objects1:objects){
                    all.add(subjects1+" "+verbs1+" "+objects1);

                }
            }
        }

    return all;
    }
}
