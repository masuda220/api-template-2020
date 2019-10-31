package morecon.application.service;

import morecon.application.repository.order.OrderRepository;
import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order accept(Attempt attempt) {

        //注文idの取得
        OrderId newOrderId = new OrderId(orderRepository.newOrderId());

        //Order作成
        orderRepository.register(attempt, newOrderId);

        return orderRepository.findBy(newOrderId);

    }

    public Order findBy(OrderId orderId) {
        return orderRepository.findBy(orderId);
    }

    public List<Order> listAll(){
        return orderRepository.listAll();
    }

}
