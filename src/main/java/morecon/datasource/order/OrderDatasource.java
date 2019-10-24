package morecon.datasource.order;

import morecon.application.repository.order.OrderRepository;
import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class OrderDatasource implements OrderRepository {

    OrderMapper orderMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public OrderDatasource(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public void register(Attempt attempt, OrderId orderId) {
        orderMapper.register(attempt, orderId);
    }

    @Override
    public Integer newOrderId() {
        return orderMapper.newOrderId();
    }

    @Override
    public Order findBy(OrderId orderId) {
        return orderMapper.findBy(orderId);
    }

}
