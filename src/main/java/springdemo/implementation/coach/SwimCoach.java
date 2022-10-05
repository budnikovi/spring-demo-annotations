package springdemo.implementation.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springdemo.interfaces.Coach;
import springdemo.interfaces.FortuneService;
public class SwimCoach implements Coach {
    private FortuneService fortuneService;
    @Value("${abc.email}")
    private String email;
    @Value("${abc.team}")
    private String team;
    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
