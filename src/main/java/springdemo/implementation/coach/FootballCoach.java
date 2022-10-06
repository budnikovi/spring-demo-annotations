package springdemo.implementation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import springdemo.interfaces.Coach;
import springdemo.interfaces.FortuneService;

public class FootballCoach implements Coach {
    @Autowired
    @Qualifier("somethingFortuneService")
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Play football";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
