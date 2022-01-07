package java9;

import java.util.stream.Stream;

public class StreamingAPI {

    void method() {
        Stream streamNull = Stream.ofNullable(null);

        Stream stream = Stream.of();
        stream.takeWhile(a -> true)
                .dropWhile(b -> true);
    }
}
