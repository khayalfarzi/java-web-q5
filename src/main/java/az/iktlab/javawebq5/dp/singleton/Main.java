package az.iktlab.javawebq5.dp.singleton;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Dog dog = Dog.getInstance();
        }
    }
}
