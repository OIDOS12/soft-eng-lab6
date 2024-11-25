package VisitorLab6;

import java.util.ArrayList;
import java.util.List;

/**
 * The Panels class represents a panel that can contain other components.
 */
public class Panels implements Component {

    /**
     * List of child components contained within this panel.
     */
    private List<Component> children = new ArrayList<>();

    /**
     * Accepts a visitor to perform operations on the panel and its child components.
     *
     * @param visitor the visitor performing the operation.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Component child : children) {
            child.accept(visitor);
        }
    }

    /**
     * Adds a new component to the panel.
     *
     * @param component the component to be added to the panel.
     */
    public void add(Component component) {
        children.add(component);
    }

    /**
     * Removes a component from the panel.
     *
     * @param component the component to be removed from the panel.
     */
    public void remove(Component component) {
        children.remove(component);
    }
}
