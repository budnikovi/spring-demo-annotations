package springdemo.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.interfaces.Coach;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

        // check if they are yhe same
        boolean result = (theCoach == alphaCoach);

        //print ou the results

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach " + theCoach);

        System.out.println("\nMemory location for alphaCoach " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
