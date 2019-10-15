package example.datasource.reservation;

import example.application.repository.reservation.ReservationRepository;
import example.domain.model.reservation.Request;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationDatasource implements ReservationRepository {

    RequestMapper requestMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    ReservationDatasource(RequestMapper requestMapper) {
        this.requestMapper = requestMapper;
    }

    @Override
    public int requestNumber() {
        return requestMapper.requestNumber();
    }

    @Override
    public void register(Request request) {
      requestMapper.register(request);
    }

    @Override
    public Request findBy(int id) {
        return requestMapper.findBy(id);
    }

    @Override
    public List<Request> listAll() {
        return requestMapper.listAll();
    }
}
