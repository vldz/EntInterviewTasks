package app.controllers.Exceptions;

public class WrongTypeException extends RuntimeException {
    public WrongTypeException(String type) {
        super("No type as " + type);
    }
}
