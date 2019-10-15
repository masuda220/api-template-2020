package example.datasource.reservation;

import example.application.repository.reservation.ReservationRepository;
import example.domain.indentifier.RequestNumber;
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
    public void register(Request request) {
        requestMapper.register(request);
    }

    @Override
    public Request findBy(RequestNumber requestNumber) {
        Request result = requestMapper.findBy(requestNumber);
        if (result == null) throw new IllegalArgumentException(
                String.format("該当する依頼はありません：%s", requestNumber)
        );

        return result;
    }

    @Override
    public List<Request> listAll() {
        return requestMapper.listAll();
    }
}
