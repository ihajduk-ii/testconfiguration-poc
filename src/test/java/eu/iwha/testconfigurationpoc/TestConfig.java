package eu.iwha.testconfigurationpoc;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @Bean
    public SomeClass someClass() {
        return new SomeClass();
    }
}
