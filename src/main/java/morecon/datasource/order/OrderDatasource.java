package morecon.datasource.order;

import morecon.application.repository.order.OrderRepository;
import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Line;
import morecon.domain.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class OrderDatasource implements OrderRepository {

    OrderMapper orderMapper;
    OrderLineMapper orderLineMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public OrderDatasource(OrderMapper orderMapper, OrderLineMapper orderLineMapper) {
        this.orderMapper = orderMapper;
        this.orderLineMapper = orderLineMapper;
    }

    @Override
    public void register(Attempt attempt, OrderId orderId) {
        orderMapper.register(attempt, orderId);
        for (Line line : attempt.lines.list) {
            orderLineMapper.register(line, orderId);
        }
    }

    @Override
    public Integer newOrderId() {
        return orderMapper.newOrderId();
    }

    @Override
    public Order findBy(OrderId orderId) {
        Order result = orderMapper.findBy(orderId);
        System.out.println(result);
        return result;
    }

    @Override
    public List<Order> listAll() {
        return orderMapper.listAll();
    }

}
