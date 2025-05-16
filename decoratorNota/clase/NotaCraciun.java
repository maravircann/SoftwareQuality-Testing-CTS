package clase;

public class NotaCraciun extends NotaDecorator{
    public NotaCraciun(INota nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
