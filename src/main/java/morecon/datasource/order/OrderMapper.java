package morecon.datasource.order;

import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Attempt;
import morecon.domain.model.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    void register(@Param("attempt") Attempt attempt, @Param("orderId") OrderId orderId);
    Integer newOrderId();
    Order findBy(@Param("orderId") OrderId orderId);
}
