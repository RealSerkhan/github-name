package HashMap.ownTests;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ItemGroup {
    public static void main(String[] args) {

        List<Item>items= Arrays.asList( new Item("Door", 10),
                new Item("Television", 500),
                new Item("Window", 25),
                new Item("Ring", 25)
        );
        Map<Integer, Set<String>>listEntry=items.stream().collect(Collectors.groupingBy(Item::getPrise, Collectors.mapping(Item::getName,Collectors.toSet())));
        System.out.println(listEntry);

    }
}
