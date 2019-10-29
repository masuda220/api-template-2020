package morecon.api._error.binding;

public class FieldErrorException extends RuntimeException {
    ApiFieldErrors fieldErrors;

    public FieldErrorException(ApiFieldErrors fieldErrors) {
        super(fieldErrors.toString());
        this.fieldErrors = fieldErrors;
    }

    public ApiFieldErrors fieldErrors() {
        return fieldErrors;
    }


    @Override
    public String toString() {
        return "FieldErrorException{" +
                "fieldErrors=" + fieldErrors +
                '}';
    }
}
