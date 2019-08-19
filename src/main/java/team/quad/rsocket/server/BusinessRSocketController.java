package team.quad.rsocket.server;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class BusinessRSocketController {

  private BusinessRepository businessRepository;

  @MessageMapping("feedBusiness")
  public Flux<Business> feed() {
    return businessRepository.findAll();
  }

  @MessageMapping("collectBusiness")
  public Mono<Business> collect(Business business) {
    return businessRepository.save(business);
  }
}
