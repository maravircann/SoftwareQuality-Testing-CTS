package program;

import clase.Component;
import clase.Composite;
import clase.Leaf;


public class Main {
    public static void main(String[] args) {

        Component file1=new Leaf("file1.txt");
        Component file2=new Leaf("file2.txt");

        Component dir=new Composite("documents");
        dir.addComponent(file1);
        dir.addComponent(file2);

        Component file3=new Leaf("file3.txt");
        Component root=new Composite("root");

        root.addComponent(file3);
        root.addComponent(dir);

        root.operation();

    }
}