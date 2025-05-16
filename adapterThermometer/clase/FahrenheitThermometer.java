package clase;



public class FahrenheitThermometer {
    private double lastReading;

    public FahrenheitThermometer(double lastReading) {
        this.lastReading = lastReading;
    }
    public double getFahrenheitTemperature(){

        return this.lastReading;

    }

}
