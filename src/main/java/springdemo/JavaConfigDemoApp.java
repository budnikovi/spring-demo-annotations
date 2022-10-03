package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        BasketballCoach basketballCoach = context.getBean("basketballCoach",BasketballCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(basketballCoach.getTeam());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(basketballCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
