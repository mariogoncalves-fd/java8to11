package java9;

public interface PrivateMethodsInterface {
    
    void method();
    
    default void defaultMethodA() {
        privateMethod();
    }

    default void defaultMethodB() {
        privateMethod();
    }

    private void privateMethod() {

    }

}
