package springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;
@Component
@Qualifier("randomFortuneFromFile")
public class ReadRandomFortuneFromFileService implements FortuneService{
    @Value("${arrayOfRandomStrings}")
    private String[] array;
    @Value("${greeting}")
    private String greeting;
    private String randomFortune(){
        Random random = new Random();
        int num = random.nextInt(array.length);
        return array[num];
    }
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.printf(">> %s%n",greeting);
    }
    @Override
    public String getFortune() {
        return randomFortune();
    }
}
