package Java10;

import java.util.Optional;

public class Optionals {

    void method() {
        final Optional<String> optional = Optional.of("optional");

        //orElseThrow
        final String s = optional.orElseThrow();
    }
}
