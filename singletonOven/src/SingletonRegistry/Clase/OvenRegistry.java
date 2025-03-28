package SingletonRegistry.Clase;

import SingletonSimplu.Program.Main;

import java.util.HashMap;
import java.util.Map;

public class OvenRegistry {
    private static final int MAX_OVENS=4;
    private static Map<Integer, Oven> ovens=new HashMap<>();


    public static Oven getOven(int id){
        if(ovens.containsKey(id)){
            return ovens.get(id);
        }
        if(ovens.size()<MAX_OVENS){
            Oven newOven=new Oven(id, 270);
            ovens.put(id, newOven);
            return newOven;
        }else{
            System.out.println("Not enough space!!");
            return null;
        }
    }

    public static void displayAllOvens(){
        for(Oven oven: ovens.values()){
            oven.seeDishes();
            System.out.println();
        }
    }

    public static int getOvenCount(){
        return ovens.size();
    }
}
