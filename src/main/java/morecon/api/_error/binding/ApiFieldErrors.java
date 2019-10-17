package morecon.api._error.binding;

import java.util.ArrayList;
import java.util.List;

public class ApiFieldErrors {
    List<ApiFieldError> errors = new ArrayList<>();

    void addError(ApiFieldError error) {
        errors.add(error);
    }
}
