package az.iktlab.javawebq5.dp.abstractfactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
