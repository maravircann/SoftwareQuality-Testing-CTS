package clase;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements IStructura{

    private final String denumire;
    private final List<IStructura> sectii=new ArrayList<>();

    public DepartamentComposite(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departament: "+denumire);
        for(IStructura sectie: sectii){
            sectie.descriereStructura();
        }
    }

    @Override
    public void adaugaStructura(IStructura s) {
        sectii.add(s);
    }

    @Override
    public void stergeStructura(IStructura s) {
        sectii.remove(s);
    }

    @Override
    public IStructura getStructura(int index) {
        return sectii.get(index);
    }
}
