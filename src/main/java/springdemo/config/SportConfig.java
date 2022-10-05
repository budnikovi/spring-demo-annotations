package springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springdemo.implementation.coach.SwimCoach;
import springdemo.implementation.fortune.SadFortuneService;
import springdemo.interfaces.Coach;
import springdemo.interfaces.FortuneService;

@Configuration
@ComponentScan("springdemo")
@PropertySource("application.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
