package springdemo.run;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.config.SportConfig;
import springdemo.implementation.coach.BasketballCoach;
import springdemo.implementation.coach.SwimCoach;
import springdemo.interfaces.Coach;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getEmail());

        // close the context
        context.close();
    }
}
