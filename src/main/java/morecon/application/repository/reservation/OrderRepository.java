package morecon.application.repository.reservation;

import morecon.domain.model.order.Order;

public interface OrderRepository {
    void register(Order order);
    Order findBy(String id);
}
