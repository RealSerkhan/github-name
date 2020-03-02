package All_Possible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Metinler {
    public static void main(String[] args) {
        List<String> subjects =  asList("Noel", "The cat", "The dog");
        List<String> verbs =     asList("wrote", "chased", "slept on");
        List<String> objects =   asList("the book","the ball","the bed");
        ArrayList<String> umumi=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            umumi.add(subjects.get(i));

            for (int j = 0; j <3 ; j++) {
                umumi.add(verbs.get(j));
                for (int k = 0; k <3 ; k++) {
                    umumi.add(objects.get(k));
                    System.out.println(umumi.toString());
                    umumi.remove(objects.get(k));


                }
                umumi.remove(verbs.get(j));

            }
            umumi.remove(subjects.get(i));

        }

    }
}
