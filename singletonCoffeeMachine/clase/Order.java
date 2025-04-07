package clase;

public class Order {
    private String name;
    private int prepTime;
    private float prepTemperature;

    private Order(String name, int prepTime, float prepTemperature) {
        this.name = name;
        this.prepTime = prepTime;
        this.prepTemperature = prepTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public float getPrepTemperature() {
        return prepTemperature;
    }

    public void setPrepTemperature(float prepTemperature) {
        this.prepTemperature = prepTemperature;
    }


    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", prepTime=" + prepTime +
                ", prepTemperature=" + prepTemperature +
                '}';
    }
}
