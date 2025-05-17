package program;


import clase.DepartamentComposite;
import clase.IStructura;
import clase.Sectie;

public class Main {
    public static void main(String[] args) {

        IStructura sectie1=new Sectie("sectie1");
        IStructura sectie2=new Sectie("sectie2");

        IStructura departament=new DepartamentComposite("departament");

        departament.adaugaStructura(sectie1);
        departament.adaugaStructura(sectie2);

        departament.descriereStructura();

        

    }
}