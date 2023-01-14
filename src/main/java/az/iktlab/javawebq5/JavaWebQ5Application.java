package az.iktlab.javawebq5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class JavaWebQ5Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebQ5Application.class, args);
    }

    @GetMapping("/web")
    public String helloWeb() {
        System.out.println("Say hello to java q5");
        return "Hello guys";
    }
}
