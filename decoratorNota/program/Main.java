package program;

import clase.*;


public class Main {
    public static void main(String[] args) {
        INota nota=new NotaSimpla(120);
        NotaDecorator notaDecorator=new NotaCraciun(nota);
        NotaPaste notaPaste=new NotaPaste(notaDecorator);
        notaPaste.printeaza();
    }
}