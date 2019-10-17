package morecon.datasource.order;

import morecon.application.repository.reservation.OrderRepository;
import morecon.domain.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OrderDatasource implements OrderRepository {

    OrderMapper orderMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public OrderDatasource(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public void register(Order order) {
        orderMapper.register(UUID.randomUUID(), order);
    }

    @Override
    public Order findBy(String id) {
        return null;
    }

}
