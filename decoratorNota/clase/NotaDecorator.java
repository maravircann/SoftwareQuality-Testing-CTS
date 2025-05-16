package clase;

public abstract class NotaDecorator implements INota{
    private INota nota;

    public NotaDecorator(INota nota) {
        this.nota = nota;
    }


    @Override
    public void printeaza() {
        this.nota.printeaza();
        printeazaFelicitare();
    }

    protected abstract void printeazaFelicitare();
}
