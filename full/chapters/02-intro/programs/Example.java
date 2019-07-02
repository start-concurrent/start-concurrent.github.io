import javax.swing.JOptionPane;

public class Example {
    public static void main(String[] args) {
        String message = "What is your favorite word?";
        String title = "Input Example";
        String word =
        JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, word, title, JOptionPane.INFORMATION_MESSAGE);
    }
}