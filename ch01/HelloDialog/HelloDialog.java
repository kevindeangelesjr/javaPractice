import javax.swing.JOptionPane;

public class HelloDialog {

    public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        System.exit(0);
    }
}