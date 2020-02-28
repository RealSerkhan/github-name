package app.Task11;







import java.util.*;
import java.util.stream.IntStream;

public class Task11_4 {
        public static void main(String[] args) {
            String origin = "Hello World";
            LinkedHashMap<Character, List<Integer>> map = new LinkedHashMap<>();

            IntStream.range(0, origin.length()).forEach(i -> {
                char c = origin.charAt(i);
                List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
                positions.add(i);
                map.put(c, positions);
            });

            map.forEach((c, n) ->
                    System.out.printf("Letter: '%c', positions:%s\n", c, n));
        }
    }

