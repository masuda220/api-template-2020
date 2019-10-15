package example.api._error.binding;

public class ApiFieldError {
    String field;
    String invalidValue;
    String description;

    public ApiFieldError(String field, String invalidValue, String description) {
        this.field = field;
        this.invalidValue = invalidValue;
        this.description = description;
    }
}
