package module4;

public class Circle {

    private double r;
    private double s;

    public Circle(double radius) {
        r = radius;
    }

    public double calculateSquare() {
        this.s = Math.PI * Math.sqrt(r);
        return Math.PI * Math.sqrt(r);
    }
}
