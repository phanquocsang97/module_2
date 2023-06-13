package ss7_interface_abstract_class.exercise.exercise1;

public class Circle implements Resizeable {
    public double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public double getCircleArea() {
        return radius * radius * Math.PI;
    }
}
