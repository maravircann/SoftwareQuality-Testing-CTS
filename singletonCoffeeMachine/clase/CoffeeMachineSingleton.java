package clase;

public class CoffeeMachineSingleton {


    private static CoffeeMachineSingleton instance;


//pentru static block

    //    static{
//        try {
//            instance=new CoffeeMachineSingleton();
//            System.out.println("coffee machine ready!!");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public static CoffeeMachineSingleton getInstance(){
//        return instance;
//    }


//pt lazy init

    private CoffeeMachineSingleton() {
    }

    public static synchronized CoffeeMachineSingleton getInstance(){
        if(instance==null){
            instance=new CoffeeMachineSingleton();
            System.out.println("coffee machine ready!!");
        }
        return instance;
    }



    public void addOrder(Order o){
        System.out.println("preparing order...");
        try {
            Thread.sleep(o.getPrepTime()*1000L);
        } catch (InterruptedException e) {
            System.out.println("interrupted while preparing:" + o.getName());

        }
        System.out.println("done! order: "+o.getName()+" at "+o.getPrepTemperature()+ "C");
    }


}
