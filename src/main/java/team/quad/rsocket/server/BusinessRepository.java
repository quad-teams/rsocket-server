package team.quad.rsocket.server;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends R2dbcRepository<Business, String> {

}
