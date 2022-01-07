package java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAPI {
    void method() {
        String str = "I\nam\nthe\ncreator of this Blog";

        //isBlank
        final boolean blank = str.isBlank();

        //lines
        final Stream<String> stream = str.lines();

        //strip() with unicodes (stripLeading() and stripTrailing())
        final String strip = str.strip();

        //repeat
        final String lol = "Ha";
        final String haHaHa = lol.repeat(3);
    }
}
