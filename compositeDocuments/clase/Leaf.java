package clase;

public class Leaf implements Component{
    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: "+name);
    }

    @Override
    public void addComponent(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
