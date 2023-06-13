package ss7_interface_abstract_class.exercise.exercise2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
