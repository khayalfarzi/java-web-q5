package az.iktlab.javawebq5.dp.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }

    @Override
    Color getColor(ColorType color) {
        return null;
    }
}
