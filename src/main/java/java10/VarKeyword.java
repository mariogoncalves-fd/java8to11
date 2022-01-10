package java10;

public class VarKeyword {

    // not allowed in class fields
    var noNo;

    void method() {
        var x = 10;

        // var is not a reserved keyword
        var var = "compatibility";
    }

    // not allowed in method parameters
    void notAllowed(var noNo) {

    }
}
