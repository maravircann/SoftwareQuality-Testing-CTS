package clase;

public class DocumentPowerPointFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new DocumentPowerPoint();
    }
}
