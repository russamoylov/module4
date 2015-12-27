package module4;

public class Temperature {

    public double toFahrenheit(int celsius){
        return celsius * 9. / 5. + 32.;
    }

    public double toCelsius(int fahrenheit){
        return (fahrenheit - 32.) * 5. / 9.;
    }

}