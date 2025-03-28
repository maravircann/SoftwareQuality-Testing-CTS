package SingletonSimplu.Clase;

public class Dish {
    private String name;
    private int cookingTime;
    private int temperature;

    public Dish(String name, int cookingTime, int temperature) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", cookingTime=" + cookingTime +
                ", temperature=" + temperature +
                '}';
    }
}
