package clase;

public interface Component {
    public void operation();
    public void addComponent(Component c);
    public void removeComponent(Component c);
    public Component getChild(int index);
}
