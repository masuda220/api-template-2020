package morecon.domain.model.reservation;

import morecon.domain.indentifier.RequestNumber;
import morecon.domain.type.Remarks;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 予約の依頼
 */
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
