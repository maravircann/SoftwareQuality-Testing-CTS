package clase;

public class NotaPaste extends NotaDecorator{
    public NotaPaste(INota nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Paste fericit!");
    }
}
