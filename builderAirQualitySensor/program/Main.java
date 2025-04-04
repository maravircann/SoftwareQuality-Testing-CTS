package program;

import clase.AirQualitySensor;
import clase.AirQualitySensorBuilder;

public class Main {
    public static void main(String[] args) {
        AirQualitySensorBuilder sensorBuilder=new AirQualitySensorBuilder();
        AirQualitySensor sensor1=sensorBuilder.setPm2_5(20).setPm10(25).setVoc(9).setCo2(40).setCo(12).setTemperature(70.0f).setHumidity(23.5f).build();
        System.out.println(sensor1);
        AirQualitySensor sensor2=sensorBuilder.setPm2_5(45).setHumidity(10.5f).build();
        System.out.println(sensor2);
    }
}