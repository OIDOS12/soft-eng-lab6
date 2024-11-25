package VisitorLab6;

/**
 * The Visitor interface defines methods for visiting components.
 */
public interface Visitor {

    /**
     * Performs an operation on a button.
     *
     * @param button the button being processed.
     */
    void visit(Button button);

    /**
     * Performs an operation on a panel.
     *
     * @param panels the panel being processed.
     */
    void visit(Panels panels);
}
