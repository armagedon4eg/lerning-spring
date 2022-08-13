package ua.com.raznodmitry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HalloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve been from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the been
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
