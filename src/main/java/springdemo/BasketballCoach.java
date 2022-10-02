package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
   FortuneService fortuneService;
    @Autowired
    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hey, wake up! Make 1000 basket throw";
    }

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
