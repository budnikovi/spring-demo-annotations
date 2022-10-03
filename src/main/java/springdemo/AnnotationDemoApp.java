package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

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
