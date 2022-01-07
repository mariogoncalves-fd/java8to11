package java11;

import java.util.function.Predicate;

public class PredicateNot {

    void method() {
        final Predicate<String> predicate = s -> s.isBlank();

        final Predicate<String> notPredicate = Predicate.not(predicate);
    }
}
