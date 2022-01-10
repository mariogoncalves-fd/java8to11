package java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ImmutableCollection {

    void method() {
        //Java 8
        final List<String> listOld = new ArrayList<>();
        listOld.add("A");
        listOld.add("B");
        listOld.add("C");
        listOld.add("C");
        final List<String> unModifiableList = Collections.unmodifiableList(listOld);


        //Java 9
        final List<String> list = List.of("A", "B", "C", "D");
        //throws UnsupportedOperationException
        final boolean e = list.add("E");

        final Set<Integer> set = Set.of(1, 2, 3, 4);
        final Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
    }
}
