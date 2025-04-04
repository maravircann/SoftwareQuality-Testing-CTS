package clase;

public class AirQualitySensorBuilder implements IBuilder{

    private int pm2_5;
    private int pm10;
    private int voc;
    private int co2;
    private int co;
    private float temperature;
    private float humidity;

    public AirQualitySensorBuilder() {
    }

    public AirQualitySensorBuilder setPm2_5(int pm2_5) {
        this.pm2_5=pm2_5;
        return this;
    }

    public AirQualitySensorBuilder setPm10(int pm10) {
        this.pm10 = pm10;
        return this;
    }

    public AirQualitySensorBuilder setVoc(int voc) {
        this.voc = voc;
        return this;
    }

    public AirQualitySensorBuilder setCo2(int co2) {
        this.co2 = co2;
        return this;
    }

    public AirQualitySensorBuilder setCo(int co) {
        this.co = co;
        return this;
    }

    public AirQualitySensorBuilder setTemperature(float temperature) {
        this.temperature = temperature;
        return this;
    }

    public AirQualitySensorBuilder setHumidity(float humidity) {
        this.humidity = humidity;
        return this;
    }

    public void reset(){
    this.pm2_5=0;
    this.pm10=0;
    this.voc=0;
    this.co2=0;
    this.co=0;
    this.temperature=0.0f;
    this.humidity=0.0f;
    }
    @Override
    public AirQualitySensor build() {
        AirQualitySensor sensor=new AirQualitySensor(this.pm2_5, this.pm10, this.voc, this.co2, this.co, this.temperature, this.humidity);
        reset();
        return sensor;
    }
}
