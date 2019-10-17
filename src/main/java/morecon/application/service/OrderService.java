package morecon.application.service;

import morecon.application.repository.reservation.OrderRepository;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order accept(Attempt attempt) {
        Order order = Order.from(attempt);
        orderRepository.register(order);
        return order;
    }
}
