package az.iktlab.javawebq5;

import az.iktlab.javawebq5.controller.HelloSpringController;
import az.iktlab.javawebq5.service.HelloSpringService;
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

        HelloSpringService service = new HelloSpringService();
        HelloSpringController controller = new HelloSpringController(service);
    }

    @PostConstruct
    public void testPostConstr() {
        System.out.println("Hello Kenan");
        System.out.println("Hello Ilkin");
        System.out.println("Hello Zoom lovers");
    }
}
