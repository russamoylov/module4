package module4;

public class Triangle {

    private double s;
    private double h;
    private double a;
    public Triangle(double high, double sideA){
        h = high;
        a = sideA;

    }
    public double calculateSquare(){
        this.s = a * h / 2;
        return a * h / 2;
    }


}
