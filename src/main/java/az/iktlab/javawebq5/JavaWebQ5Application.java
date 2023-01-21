package az.iktlab.javawebq5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JavaWebQ5Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebQ5Application.class, args);
    }

    @PostConstruct
    public void testPostConstr() {
        System.out.println("Hello Kenan");
        System.out.println("Hello Ilkin");
        System.out.println("Hello Zoom lovers");
    }
}
