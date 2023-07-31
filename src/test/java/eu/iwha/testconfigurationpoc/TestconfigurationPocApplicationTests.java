package eu.iwha.testconfigurationpoc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestConfig.class)
class TestconfigurationPocApplicationTests {

    @Autowired
    SomeClass someClass;

    @Test
    void contextLoads() {
        someClass.print();
    }

}
