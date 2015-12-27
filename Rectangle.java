package module4;

public class Rectangle {
    private double a;
    private double b;
    private double s;
    public Rectangle(double sideA, double sideB){
        a = sideA;
        b = sideB;
    }
    public double calculateSquare(){
        this.s = a * b;
        return a * b;
    }
}
