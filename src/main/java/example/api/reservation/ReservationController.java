package example.api.reservation;

import example.application.service.ReservationService;
import example.domain.model.reservation.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @PostMapping("reservations/")
    public Request registerRequest(@RequestBody @Validated RequestData request) {
        int id = reservationService.requestNumber();
        reservationService.register(request.asModel(id));
        Request model = reservationService.findBy(id);
        return model;
    }

    @GetMapping("reservations/{id}/")
    public Request findBy(@PathVariable("id") int id) {
        return reservationService.findBy(id);
    }

    @GetMapping("reservations/")
    public List<Request> listAll() {
        return reservationService.listAll();
    }

}
