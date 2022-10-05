package springdemo.implementation.fortune;

import org.springframework.stereotype.Component;
import springdemo.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
