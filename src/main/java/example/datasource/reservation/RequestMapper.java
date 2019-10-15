package example.datasource.reservation;

import example.domain.indentifier.RequestNumber;
import example.domain.model.reservation.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {
    void register(Request request);

    Request findBy(RequestNumber requestNumber);

    List<Request> listAll();
}
