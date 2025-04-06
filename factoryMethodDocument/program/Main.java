package program;


import clase.*;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentPdfFactory=new DocumentPdfFactory();
        DocumentFactory documentWordFactory=new DocumentWordFactory();
        DocumentFactory documentPowerPointFactory=new DocumentPowerPointFactory();

        Document docPdf=documentPdfFactory.createDocument();
        Document docWord=documentWordFactory.createDocument();
        Document docPowerPoint=documentPowerPointFactory.createDocument();

        docPdf.export();
        docPowerPoint.afiseazaDetalii();
    }
}