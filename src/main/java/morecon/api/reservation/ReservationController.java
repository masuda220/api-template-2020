package morecon.api.reservation;

import morecon.api._error.binding.BindingErrorsResolver;
import morecon.api._error.binding.FieldErrorException;
import morecon.application.service.ReservationService;
import morecon.domain.indentifier.RequestNumber;
import morecon.domain.model.reservation.Request;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Api(tags = "予約 API")
@RestController
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @ApiOperation(value = "予約の申し込み")
    @PostMapping("reservations/")
    public Request registerRequest(@RequestBody @Validated RequestData request,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            BindingErrorsResolver resolver = new BindingErrorsResolver(bindingResult);
            throw new FieldErrorException(resolver.toFieldErrors());
        }

        RequestNumber requestNumber = RequestNumber.generate();
        reservationService.register(request.asModel(requestNumber));
        Request model = reservationService.findBy(requestNumber);
        return model;
    }

    @ApiOperation(value = "予約の詳細")
    @GetMapping("reservations/{requestNumber}/")
    public Request findBy(@PathVariable("requestNumber") UUID requestNumber) {

        return reservationService.findBy(RequestNumber.from(requestNumber.toString()));
    }

    @ApiOperation(value = "予約の一覧")
    @GetMapping("reservations/")
    public List<Request> listAll() {
        return reservationService.listAll();
    }

}
