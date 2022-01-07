package java9;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optionals {

    void method() {
        final Optional<String> optional = Optional.of("optional");

        //Java 8
        if (optional.isPresent()) {
            //do something with
        } else {
            //default behaviour;
        }
        //Java 9
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("No string present"));

        //or
        final Optional<String> default_string = getOptional().or(() -> Optional.of("default String"));

        //stream
        optional.stream()
                .filter("A"::equals)
                .collect(Collectors.toList());
    }


    Optional<String> getOptional() {
        return Optional.of("str");
    }
}
