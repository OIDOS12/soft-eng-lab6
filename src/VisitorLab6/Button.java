package VisitorLab6;

/**
 * The Button class represents a button in the component.
 */
public class Button implements Component {

    /**
     * Accepts a visitor to perform operations on the button.
     *
     * @param visitor the visitor performing the operation.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

