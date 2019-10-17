package morecon.datasource.reservation;

import morecon.domain.indentifier.RequestNumber;
import morecon.domain.model.reservation.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {
    void register(Request request);

    Request findBy(RequestNumber requestNumber);

    List<Request> listAll();
}
