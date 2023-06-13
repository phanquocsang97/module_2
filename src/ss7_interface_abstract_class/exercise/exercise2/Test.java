package ss7_interface_abstract_class.exercise.exercise2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(5);

        Shape[] arrays = new Shape[3];
        arrays[0] = circle;
        arrays[1] = square;
        arrays[2] = rectangle;
        for (Shape value : arrays) {
            System.out.println("Area : " + value.getArea());
            if (value instanceof Colorable) {
//                Colorable colorable = (Colorable) value;
//                colorable.howToColor();
                System.out.println(((Colorable) value).howToColor());
            }
        }
    }
}
