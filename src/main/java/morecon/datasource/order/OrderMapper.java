package morecon.datasource.order;

import morecon.domain.model.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.UUID;

@Mapper
public interface OrderMapper {
    void register(@Param("id") UUID id, @Param("order") Order order);

}
