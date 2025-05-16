package clase;

public class CoffeeMachineFacade {
    private final Boiler boiler=new Boiler();
    private final Grinder grinder=new Grinder();
    private final MilkFrother milkFrother=new MilkFrother();
    private final Pump pump=new Pump();

    public void brewEspresso(){
        grinder.grindBeans(5);
        boiler.heatWater(93.0);
        pump.pumpWater(0.03);
        System.out.println("Espresso ready!!");
    }

    public void brewLatte(){
        brewEspresso();
        milkFrother.frothMilk();
        System.out.println("Latte ready!!");
    }

    public void cleanMachine(){
        pump.pumpWater(0.5);
        System.out.println("Machine cleaned!!");
    }
}
