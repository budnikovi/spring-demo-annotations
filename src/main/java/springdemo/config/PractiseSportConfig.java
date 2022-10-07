package springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springdemo.implementation.coach.FootballCoach;
import springdemo.implementation.coach.SwimCoach;
import springdemo.implementation.fortune.SadFortuneService;
import springdemo.implementation.fortune.SomethingFortuneService;
import springdemo.interfaces.Coach;
import springdemo.interfaces.FortuneService;

@Configuration
public class PractiseSportConfig {

    // define bean for our happy fortune service
    @Bean
    public FortuneService somethingFortuneService() {
        return new SomethingFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach footballCoach() {
        FootballCoach myFootballCoach = new FootballCoach(somethingFortuneService());

        return myFootballCoach;
    }
}
