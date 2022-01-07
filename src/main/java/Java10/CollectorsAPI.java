package Java10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAPI {

    void method() {
        List<Integer> list = List.of(10, 15, 20, 24);

        List<Integer> newList =  list.stream().filter(i -> i%2==0).collect(Collectors.toUnmodifiableList());
        // Collectors.toUnmodifiableSet();
        // Collectors.toUnmodifiableMap();
    }
}
