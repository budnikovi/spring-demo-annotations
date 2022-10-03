package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
   @Value("${abc.team}")
    private String team;

    FortuneService fortuneService;
    @Autowired
    public BasketballCoach(@Qualifier("randomFortuneFromFile") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hey, wake up! Make 1000 basket throw";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    public String getTeam() {
        return team;
    }
}
