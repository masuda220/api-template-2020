package morecon.api._error.binding;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class BindingErrorsResolver {
    public BindingErrorsResolver(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    BindingResult bindingResult;

    public ApiFieldErrors toFieldErrors() {
        ApiFieldErrors result = new ApiFieldErrors();
        List<FieldError> errors = bindingResult.getFieldErrors();
        for (FieldError each : errors) {

            String rejectedValue = "";
            if ( each.getRejectedValue() != null ) rejectedValue = each.getRejectedValue().toString();
            ApiFieldError fieldError = new ApiFieldError(
                    each.getField(),
                    rejectedValue,
                    each.getDefaultMessage()
            );
            result.addError(fieldError);
        }
        return result;
    }

}
