package module4;


public class Main {
    public static void main (String[] args){
        Circle circle = new Circle(7);
        circle.calculateSquare();
        System.out.println("Square of circle is " + circle.calculateSquare());

        Triangle triangle = new Triangle(3,4);
        triangle.calculateSquare();
        System.out.println("Square of triangle is " + triangle.calculateSquare());

        Rectangle rectangle = new Rectangle(5,6);
        rectangle.calculateSquare();
        System.out.println("Square of rectangle is " + rectangle.calculateSquare());

        Distance distance = new Distance(1,2,7,0);
        System.out.println("Distance between two dots is " + distance.getDistance());

        Temperature temperature = new Temperature();
        System.out.println("From celsius to fahrenheit " + temperature.toFahrenheit(25));
        System.out.println("From fahrenheit to celsius " + temperature.toCelsius(77));


    }
}
