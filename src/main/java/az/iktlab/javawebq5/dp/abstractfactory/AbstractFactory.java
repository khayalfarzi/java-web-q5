package az.iktlab.javawebq5.dp.abstractfactory;

public abstract class AbstractFactory {
    abstract Shape getShape(ShapeType shape);

    abstract Color getColor(ColorType color);
}
