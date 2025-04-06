package clase;

public class DocumentWordFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new DocumentWord();
    }
}
