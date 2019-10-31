package morecon.datasource.order;

import morecon.domain.indentifier.OrderId;
import morecon.domain.model.order.Line;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderLineMapper {
    void register(@Param("line") Line line, @Param("orderId") OrderId orderId);
}
