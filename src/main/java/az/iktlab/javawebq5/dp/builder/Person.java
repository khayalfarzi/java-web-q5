package az.iktlab.javawebq5.dp.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//@Builder
public class Person {

    private final int id;
    private final String name;
    private final String surname;

    public Person(PersonBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private int id;

        public PersonBuilder() {
        }


        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }


        //Return the finally consrcuted User object
        public Person build() {
            return new Person(this);
        }
    }
}
