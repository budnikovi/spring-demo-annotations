package springdemo.run;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.config.SportConfig;
import springdemo.implementation.coach.SwimCoach;
import springdemo.interfaces.Coach;

public class FootballJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("footballCoach",Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
