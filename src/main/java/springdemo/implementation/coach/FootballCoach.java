package springdemo.implementation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springdemo.interfaces.Coach;
import springdemo.interfaces.FortuneService;
@Component
public class FootballCoach implements Coach {

    FortuneService fortuneService;

    public FootballCoach(FortuneService somethingFortuneService) {
        fortuneService = somethingFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Play football";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
