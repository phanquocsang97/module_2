package ss5_access_modifier_static.exercise.exercise1;

public class Circle {
    private final double radius;
    private final String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.getRadius();
        double area = circle.getArea();
        System.out.println(radius);
        System.out.println(area);
    }
}
