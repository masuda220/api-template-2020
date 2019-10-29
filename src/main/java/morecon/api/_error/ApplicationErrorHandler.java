package morecon.api._error;

import morecon.api._error.binding.ApiFieldErrors;
import morecon.api._error.binding.FieldErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages = {"morecon.api"})
public class ApplicationErrorHandler {

    static final Logger logger = LoggerFactory.getLogger(ApplicationErrorHandler.class);

    // Field Validation
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({FieldErrorException.class})
    @ResponseBody
    public ApiFieldErrors fieldErrors(FieldErrorException exception) {
        return exception.fieldErrors();
    }

    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseBody
    public Errors error(IllegalArgumentException exception) {
        return errors(ErrorType.unKnown, exception);
    }

    private Errors errors(ErrorType errorType, Exception exception) {
        logger.error(exception.toString());
        Error error = new Error(errorType, exception.getMessage());
        return Errors.from(error);
    }

    // Throws by Spring Framework JSON binding
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseBody
    public Errors parseError(HttpMessageNotReadableException exception) {
        logger.error(exception.toString());
        Error error = new Error(
                ErrorType.requestParseError,
                exception.getMostSpecificCause().getMessage()
        );
        return Errors.from(error);
    }
}
