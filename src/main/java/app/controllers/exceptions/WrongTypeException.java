package app.controllers.exceptions;

public class WrongTypeException extends RuntimeException {
    public WrongTypeException(String type) {
        super("Wrong input: \"" + type + "\"\n");
    }
}
