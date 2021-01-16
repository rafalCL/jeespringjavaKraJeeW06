package pl.coderslab.jeespringjava.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.jeespringjava.beans.HelloWorld;
import pl.coderslab.jeespringjava.config.AppConfig;

public class SpringDiApplication {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        hw.hello();

        ctx.close();
    }
}
