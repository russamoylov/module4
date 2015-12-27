package module4;


public class Distance {
    double x1;
    double y1;
    double x2;
    double y2;

    public Distance(double pointX1, double pointY1, double pointX2, double pointY2) {
        x1 = pointX1;
        y1 = pointY1;
        x2 = pointX2;
        y2 = pointY2;
    }

    public double getDistance() {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
