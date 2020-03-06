package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Integer> randoms =
                IntStream.range(0, 10) // int 0..9
                        .map(x -> Fn.rand())   // int 0..9 -> ten randoms
                        .boxed()               // random(int) -> Integer
                        .collect(Collectors.toList());
        List<Integer> randoms2 =
                Stream.generate(() -> Fn.rand()) // Integer random
                        .limit(10)
                        .collect(Collectors.toList());
        System.out.println(randoms);
        System.out.println(randoms2);

    }
}
