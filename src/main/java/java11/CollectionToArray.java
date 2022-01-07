package java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

    void method() {
        List<String> sampleList = Arrays.asList("A", "B");
        String[] sampleArray = sampleList.toArray(String[]::new);
    }
}
