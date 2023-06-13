package ss7_interface_abstract_class.exercise.exercise2;

public class Square extends Shape implements Colorable {
    private double height;

    public Square() {
    }

    public Square(double height) {
        this.height = height;
    }
    public double getArea() {
        return height * height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height + howToColor() + getArea() +
                '}';
    }

    public String howToColor() {
        return "Color all four side";
    }
}
