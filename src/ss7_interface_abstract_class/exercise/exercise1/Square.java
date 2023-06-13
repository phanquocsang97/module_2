package ss7_interface_abstract_class.exercise.exercise1;

public class Square implements Resizeable {
    public double h = 10;

    public Square() {
    }

    public Square(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Square{" + "h=" + h + '}';
    }

    public void resize(double percent) {
        this.h += this.h * percent / 100;
    }

    public double getSquareArea() {
        return h * h;
    }
}
