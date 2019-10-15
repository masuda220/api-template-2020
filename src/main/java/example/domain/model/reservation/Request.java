package example.domain.model.reservation;

import example.domain.indentifier.RequestNumber;
import example.domain.type.Remarks;

import java.time.LocalDate;
import java.time.LocalTime;

public class Request {
    RequestNumber requestNumber;
    Remarks remarks;
    LocalDate date;
    LocalTime startTime;

    public Request(RequestNumber requestNumber, Remarks remarks, LocalDate date, LocalTime startTime) {
        this.requestNumber = requestNumber;
        this.remarks = remarks;
        this.date = date;
        this.startTime = startTime;
    }

    public Request() {

    }
}
