package clase;

public class AirQualitySensor implements AbstractAirQualitySensor{
    private int pm2_5;
    private int pm10;
    private int voc;
    private int co2;
    private int co;
    private float temperature;
    private float humidity;

     AirQualitySensor(int pm2_5, int pm10, int voc, int co2, int co, float temperature, float humidity) {
        this.pm2_5 = pm2_5;
        this.pm10 = pm10;
        this.voc = voc;
        this.co2 = co2;
        this.co = co;
        this.temperature = temperature;
        this.humidity = humidity;
    }

     void setPm2_5(int pm2_5) {
        this.pm2_5 = pm2_5;
    }

     void setPm10(int pm10) {
        this.pm10 = pm10;
    }

     void setVoc(int voc) {
        this.voc = voc;
    }

     void setCo2(int co2) {
        this.co2 = co2;
    }

     void setCo(int co) {
        this.co = co;
    }

     void setTemperature(float temperature) {
        this.temperature = temperature;
    }

     void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "AirQualitySensor{" +
                "pm2_5=" + pm2_5 +
                ", pm10=" + pm10 +
                ", voc=" + voc +
                ", co2=" + co2 +
                ", co=" + co +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
