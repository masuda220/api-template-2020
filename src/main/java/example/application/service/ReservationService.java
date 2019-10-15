package example.application.service;

import example.application.repository.reservation.ReservationRepository;
import example.domain.indentifier.RequestNumber;
import example.domain.model.reservation.Request;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    ReservationRepository reservationRepository;

    public void register(Request request) {
        reservationRepository.register(request);
    }

    public Request findBy(RequestNumber requestNumber) {
        return reservationRepository.findBy(requestNumber);
    }

    public List<Request> listAll() {
        return reservationRepository.listAll();
    }

}
