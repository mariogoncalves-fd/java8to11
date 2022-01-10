package java10;

import java.util.List;
import java.util.stream.Collectors;

public class ImmutableCollection {

    void method() {
        final List<String> list = List.of("A", "B", "C", "D");

        final List<String> unmodifiableList = List.copyOf(list);
        final List<String> collect = list.stream()
                .filter("A"::equals)
                .collect(Collectors.toUnmodifiableList());
    }
}
