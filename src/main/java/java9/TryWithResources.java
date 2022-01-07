package java9;

public class TryWithResources {

    public void method() {

         // Resources could not be created other than inside the try block.
        MyThread th = new MyThread();
        try (th) { //Resource references are not supported at language level '8'
            th.executeSomething();
        } catch (Exception ex) {}
    }

    static class MyThread extends Thread implements AutoCloseable {
        @Override
        public void close() throws Exception {

        }

        public void executeSomething() {
        }
    }
}
