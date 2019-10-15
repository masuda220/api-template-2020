package example.application.service;

import example.application.repository.reservation.ReservationRepository;
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

    // TODO id should be ReservationNumber
    public Request findBy(int id) {
        return reservationRepository.findBy(id);
    }

    public List<Request> listAll() {
        return reservationRepository.listAll();
    }

    public int requestNumber() {
        return reservationRepository.requestNumber();
    }
}
