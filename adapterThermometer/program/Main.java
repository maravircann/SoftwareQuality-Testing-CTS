package program;

import clase.FahrenheitToCelsiusAdapter;
import clase.CelsiusThermometer;
import clase.FahrenheitThermometer;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer oldThermometer=new FahrenheitThermometer(67);
        CelsiusThermometer newThermometer=new FahrenheitToCelsiusAdapter(oldThermometer);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(String.format("Fahrenheit Temperature: " + oldThermometer.getFahrenheitTemperature()));
        System.out.println(String.format("Celsius Temperature: " + df.format(newThermometer.getCelsiusTemperature())));
    }
}