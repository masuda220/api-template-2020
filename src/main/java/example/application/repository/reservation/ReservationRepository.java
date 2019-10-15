package example.application.repository.reservation;

import example.domain.indentifier.RequestNumber;
import example.domain.model.reservation.Request;

import java.util.List;

public interface ReservationRepository {
    void register(Request request);

    Request findBy(RequestNumber requestNumber) ;

    List<Request> listAll();
}
