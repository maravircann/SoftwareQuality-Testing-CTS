package clase;

import java.util.HashMap;
import java.util.Map;

public class RezervareFactory {
        private Map<TipRezervare, IRezervare> rezervari=new HashMap<>();

        public void inregistreaza(TipRezervare tipRezervare, IRezervare rezervare){
            rezervari.put(tipRezervare, rezervare);
        }

        public IRezervare creeazaCopie(TipRezervare tip){
            IRezervare rezervare=rezervari.get(tip);
            if(rezervare!=null){
                return rezervare.copy();
            }
            throw new IllegalArgumentException("Tipul '" + tip + "' nu a fost inregistrat.");
        }
}
