package clase;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private final String name;
    private final List<Component> children=new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Composite: "+name);
        for (Component child: children){
            child.operation();
        }
    }

    @Override
    public void addComponent(Component c) {
        children.add(c);
    }

    @Override
    public void removeComponent(Component c) {
    children.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}
