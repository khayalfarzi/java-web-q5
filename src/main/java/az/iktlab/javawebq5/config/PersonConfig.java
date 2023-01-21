package az.iktlab.javawebq5.config;

import az.iktlab.javawebq5.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class PersonConfig {

    // stateful - sorgu gelende teze obyekt yaradir - prototype
    // stateless - singleton
    // singleton

    /**
     * EJB       |  Bean
     * stateful     prototype
     * stateless    Singleton
     * Request
     * Session
     * GlobalSession
     */
    @Bean
//    @Scope(scopeName = "prototype")
    public Person configPerson() {
        return Person.builder()
                .id(2)
                .name("Ilham")
                .surname("Kenan")
                .age(234)
                .build();
    }
}
