package clase;

public class FahrenheitToCelsiusAdapter implements CelsiusThermometer{
    private final FahrenheitThermometer fahrenheitThermometer;

    public FahrenheitToCelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    @Override
    public double getCelsiusTemperature() {

        return (fahrenheitThermometer.getFahrenheitTemperature()-32)*5.0/9.0;

    }
}
