package clase;

public class NotaSimpla implements INota{

    private float total;

    public NotaSimpla(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printeaza() {
        System.out.println("Totalul notei de plata este de "+this.total+" lei!");
    }
}
