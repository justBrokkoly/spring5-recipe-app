package guru.springframework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadFromatException extends NumberFormatException {

    public BadFromatException() {
        super();
    }

    public BadFromatException(String s) {
        super(s);
    }
}
