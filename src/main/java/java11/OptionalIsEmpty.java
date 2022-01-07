package java11;

import java.util.Optional;

public class OptionalIsEmpty {

    void method() {
        Optional<String> opt = Optional.empty();

        final boolean oldWay = !opt.isPresent();
        final boolean newWay = opt.isEmpty();
    }
}
