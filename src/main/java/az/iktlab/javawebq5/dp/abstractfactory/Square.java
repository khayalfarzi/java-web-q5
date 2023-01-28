package az.iktlab.javawebq5.dp.abstractfactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
