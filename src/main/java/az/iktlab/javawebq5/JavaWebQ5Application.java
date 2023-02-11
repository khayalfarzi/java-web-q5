package az.iktlab.javawebq5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

@EnableFeignClients
@SpringBootApplication
public class JavaWebQ5Application {


    public static void main(String[] args) {
        SpringApplication.run(JavaWebQ5Application.class, args);
    }

    @PostConstruct
    public void testPostConstr() {
    }
}
