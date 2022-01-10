package java10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsAPI {

    void method() {
        List<Integer> list = List.of(10, 15, 20, 24);

        List<Integer> newList =  list.stream().filter(i -> i%2==0).collect(Collectors.toUnmodifiableList());
        Set<Integer> newSet =  list.stream().filter(i -> i%2==0).collect(Collectors.toUnmodifiableSet());
        Map<Integer, Integer> newMap =  list.stream().filter(i -> i%2==0).collect(Collectors.toUnmodifiableMap(Function.identity(), Function.identity()));
    }
}
