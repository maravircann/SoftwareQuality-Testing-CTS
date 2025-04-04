package claseRegistry;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMachineRegistry {
    private static final Map<Integer, CoffeeMachine> registry= new HashMap<>();
    private static final int MAX_INSTANCES=3;

    public static CoffeeMachine getInstances(int id){
        if(registry.containsKey(id)){
            return registry.get(id);
        }
        if(registry.size()>=MAX_INSTANCES){
            System.out.println("Limit reached. Cannot create a new instance!!!");
            return null;
        }
        CoffeeMachine instance=new CoffeeMachine(id);
        registry.put(id, instance);
        return instance;
    }


    public static void showAll(){
        System.out.println("Active coffe machines: ");
        registry.forEach((id, machine)-> System.out.println("id: "+id+"->"+machine));
    }

}
