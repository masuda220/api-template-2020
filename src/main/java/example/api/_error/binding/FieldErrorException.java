package example.api._error.binding;

public class FieldErrorException extends RuntimeException {
    ApiFieldErrors fieldErrors;

    public FieldErrorException(ApiFieldErrors fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public ApiFieldErrors fieldErrors() {
        return fieldErrors;
    }
}
