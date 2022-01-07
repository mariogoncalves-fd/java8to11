package java9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CompletableFutures {

    void method() {

        CompletableFuture future = new CompletableFuture();

        //exception
        CompletableFuture<String> newOne = future.orTimeout(10, TimeUnit.SECONDS);

        //default value
        CompletableFuture<String> newTwo = future.completeOnTimeout("value in case of timeout", 10, TimeUnit.SECONDS);
    }
}
