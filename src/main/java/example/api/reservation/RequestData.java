package example.api.reservation;

import example.domain.model.reservation.Request;
import example.domain.type.Remarks;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalTime;

public class RequestData {

    @Valid
    Remarks remarks;
    @ApiModelProperty(example = "2011-11-12")
    LocalDate date;
    @ApiModelProperty(example = "13:55")
    LocalTime startTime;

    public Request asModel(int id) {
        return new Request(id, remarks, date, startTime);
    }
}
