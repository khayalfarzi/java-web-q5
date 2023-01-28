package az.iktlab.javawebq5.dp.abstractfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shape) {
        return null;
    }

    @Override
    Color getColor(ColorType color) {
        switch (color) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            default:
                return null;
        }
    }
}
