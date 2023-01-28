package az.iktlab.javawebq5.dp.singleton;

public class Dog {

    private static Dog dog;

    private Dog() {
        System.out.println("Constructor call...");
    }

    public static Dog getInstance() {
        if (dog == null)
            dog = new Dog();
        return dog;
    }
}
