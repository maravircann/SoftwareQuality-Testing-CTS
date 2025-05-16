package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, IAutobuz> autobuze;

    public FlyweightFactory() {
        this.autobuze = new HashMap<String, IAutobuz>();
    }

    public IAutobuz getAutobuz(String nrInmatriculare, String model, int anFabricatie, int nrLocuri){
        if(!autobuze.containsKey(nrInmatriculare)){
            autobuze.put(nrInmatriculare, new Autobuz(nrInmatriculare, model, anFabricatie, nrLocuri));

        }
        return autobuze.get(nrInmatriculare);
    }

    public IAutobuz getAutobuz(String nrInmatriculare) throws Exception {
        if(autobuze.containsKey(nrInmatriculare)){
            return autobuze.get(nrInmatriculare);
        }else{
            throw new Exception("Deja este inregistrat un autobuz cu acest nr de inmatriculare!");
        }
    }
}
