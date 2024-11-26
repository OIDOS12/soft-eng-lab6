package VisitorLab6;

/**
 * The Main class serves as the entry point to the program.
 * It demonstrates the use of the Visitor pattern to count the number of components.
 */
public class Main {
    public static void main(String[] args) {
        Panels panel1 = new Panels();
        Panels panel2 = new Panels();

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();

        panel1.add(panel2);
        panel1.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        CountElement count = new CountElement();
        panel1.accept(count);
        System.out.println("Number of buttons: " + count.getButtonCount());
        System.out.println("Number of panels: " + count.getPanelsCount());
    }
}
