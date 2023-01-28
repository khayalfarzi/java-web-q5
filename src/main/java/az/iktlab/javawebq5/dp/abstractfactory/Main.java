package az.iktlab.javawebq5.dp.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(Choice.SHAPE);
        Shape shape = factory.getShape(ShapeType.SQUARE);
        shape.draw();
        shape = factory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        factory = FactoryProducer.getFactory(Choice.COLOR);
        Color color = factory.getColor(ColorType.RED);
        color.fill();
        color = factory.getColor(ColorType.GREEN);
        color.fill();
    }
}
