package Collection;

import java.util.stream.IntStream;

public class IfCollection {
    public static void main(String[] args) {


//    IntStream.range(0,100)
////    .filter(_x%2==0)
////        .foreach()
        IntStream.range(0,100)
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}
