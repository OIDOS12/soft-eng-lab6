package VisitorLab6;

/**
 * The Component interface represents an element in the structure
 * that can be visited by a Visitor object.
 */
public interface Component {
    /**
     * Accepts a visitor to perform operations on the component.
     *
     * @param visitor the visitor performing the operation.
     */
    void accept(Visitor visitor);
}
