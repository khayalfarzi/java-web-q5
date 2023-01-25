package az.iktlab.javawebq5.dp.builder;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .id(2)
                .name("")
                .surname("")
                .build();
    }
}
