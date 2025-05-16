package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, IPacient> pacienti;

    public FlyweightFactory() {
        this.pacienti = new HashMap<String, IPacient>();
    }


    public IPacient getPacient(String nume, String nrtelefon, String adresa){
        if(!pacienti.containsKey(nume)){
            pacienti.put(nume, new Pacient(nume, nrtelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public IPacient getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }else{
            throw new Exception("Nu exista un pacient cu acest nume!");
        }
    }

}
