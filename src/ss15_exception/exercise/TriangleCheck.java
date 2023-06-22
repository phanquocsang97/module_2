package ss15_exception.exercise;

public class TriangleCheck {
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEgdesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEgdesException("lỗi: tam giác không hợp lệ");
        } else {
            System.out.println("tam giác hợp lệ");
        }
    }
}
