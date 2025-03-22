import clase.AutoritatePescuitEager;
import clase.AutoritatePescuitLazy;


public class Main {
    public static void main(String[] args) {

        AutoritatePescuitLazy autoritatePescuitLazy=AutoritatePescuitLazy.getInstance("ANPA", "www.anpa.ro", 10, 100);
        System.out.println(autoritatePescuitLazy.toString());

        AutoritatePescuitEager autoritatePescuitEager=AutoritatePescuitEager.getInstance();
        System.out.println(autoritatePescuitEager.toString());
    }
}