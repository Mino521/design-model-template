package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryMethodPattern.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // get object with shape circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call circle's draw method
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get object with color red
        Color color1 = colorFactory.getColor("RED");

        // call red's fill method
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
