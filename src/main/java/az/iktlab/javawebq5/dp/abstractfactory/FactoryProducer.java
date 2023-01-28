package az.iktlab.javawebq5.dp.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(Choice choice) {
        switch (choice) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                throw new RuntimeException();
        }
    }
}
