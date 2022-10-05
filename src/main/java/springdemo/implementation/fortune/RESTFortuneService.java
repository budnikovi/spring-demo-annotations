package springdemo.implementation.fortune;

import org.springframework.stereotype.Component;
import springdemo.interfaces.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "";
    }
}
