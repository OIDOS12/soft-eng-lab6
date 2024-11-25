package VisitorLab6;

/**
 * The CountElement class implements the Visitor interface and counts the number of buttons and panels.
 */
public class CountElement implements Visitor {
    private int ButtonCount;
    private int PanelsCount;

    /**
     * Returns the count of buttons.
     *
     * @return the number of buttons.
     */
    public int getButtonCount() {
        return ButtonCount;
    }

    /**
     * Returns the count of panels.
     *
     * @return the number of panels.
     */
    public int getPanelsCount() {
        return PanelsCount;
    }

    /**
     * Processes a button by incrementing the button counter.
     *
     * @param button the button being visited.
     */
    @Override
    public void visit(Button button) {
        ButtonCount++;
    }

    /**
     * Processes a panel by incrementing the panel counter.
     *
     * @param panels the panel being visited.
     */
    @Override
    public void visit(Panels panels) {
        PanelsCount++;
    }
}