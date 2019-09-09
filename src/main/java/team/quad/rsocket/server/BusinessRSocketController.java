package team.quad.rsocket.server;

import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@AllArgsConstructor
public class BusinessRSocketController {

  private final BusinessRepository businessRepository;

  @MessageMapping("Business.Feed")
  public Flux<Business> feed() {
    businessRepository.findAll();
    return businessRepository.findAll();
  }

  @MessageMapping("Business.Collect")
  public Mono<Business> collect(Business business) {
    return businessRepository.save(business);
  }
}
