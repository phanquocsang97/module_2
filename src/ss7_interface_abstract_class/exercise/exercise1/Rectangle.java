package ss7_interface_abstract_class.exercise.exercise1;

public class Rectangle implements Resizeable {
    public double height = 10;
    public double width = 5;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }

    public void resize(double percent) {
        this.height += this.height * percent / 100;
        this.width += this.width * percent / 100;
    }

    public double getRectangleArea() {
        return height * width;
    }
}
