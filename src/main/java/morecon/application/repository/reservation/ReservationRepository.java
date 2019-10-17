package morecon.application.repository.reservation;

import morecon.domain.indentifier.RequestNumber;
import morecon.domain.model.reservation.Request;

import java.util.List;

public interface ReservationRepository {
    void register(Request request);

    Request findBy(RequestNumber requestNumber) ;

    List<Request> listAll();
}
