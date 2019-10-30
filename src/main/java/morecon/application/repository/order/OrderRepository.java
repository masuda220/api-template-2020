package morecon.application.repository.order;

import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;

import java.util.List;

public interface OrderRepository {
    void register(Attempt attempt, OrderId orderId);
    Integer newOrderId();
    Order findBy(OrderId orderId);
    List<Order> listAll();
}
