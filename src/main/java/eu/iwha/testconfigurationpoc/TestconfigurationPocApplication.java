package eu.iwha.testconfigurationpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestconfigurationPocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestconfigurationPocApplication.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
