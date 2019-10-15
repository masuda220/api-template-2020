package example.api._error;

import java.util.Arrays;
import java.util.List;

public class Errors {
    List<Error> errors;

    Errors(List<Error> errors) {
        this.errors = errors;
    }

    public static Errors from(Error... errors) {
        List<Error> list = Arrays.asList(errors);
        return new Errors(list);
    }

    public static Errors from(ErrorType errorType, String description) {
        Error error = new Error(errorType, description);
        return Errors.from (error);
    }
}
