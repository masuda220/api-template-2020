package morecon.api._error;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "error")
public class Error {

    ErrorType type;
    String description;

    public Error(ErrorType type, String description) {
        this.type = type;
        this.description = description;
    }
}
