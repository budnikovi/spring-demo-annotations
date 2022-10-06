package springdemo.implementation.fortune;

import springdemo.interfaces.FortuneService;

public class SomethingFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Good day today, congratulations!";
    }
}
