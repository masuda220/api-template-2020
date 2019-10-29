package morecon.api.order;

import morecon.application.service.OrderService;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("")
    Order accept(@RequestBody Attempt attempt) {
        return orderService.accept(attempt);
    }
}
