package app.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WrongTypeOfSortAdvice {
    @ResponseBody
    @ExceptionHandler(WrongTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String wrongTypeOfSortAdvice(WrongTypeException ex) {
        return ex.getMessage();
    }
}
