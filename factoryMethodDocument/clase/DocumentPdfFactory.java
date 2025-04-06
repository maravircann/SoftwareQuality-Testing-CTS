package clase;

public class DocumentPdfFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new DocumentPdf();
    }
}
