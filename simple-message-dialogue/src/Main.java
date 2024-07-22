import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(
      null,
      "A message to Bro",
      "Title",
      JOptionPane.PLAIN_MESSAGE
    );

    JOptionPane.showMessageDialog(
      null,
      "Really educative info",
      "Title",
      JOptionPane.INFORMATION_MESSAGE
    );

    JOptionPane.showMessageDialog(
      null,
      "How's coding?",
      "Title",
      JOptionPane.QUESTION_MESSAGE
    );

    while (true) {
      JOptionPane.showMessageDialog(
        null,
        "Your Computer Has A Virus!",
        "Title",
        JOptionPane.WARNING_MESSAGE
      );

      JOptionPane.showMessageDialog(
        null,
        "Call Tech Support Now, OR ELSE",
        "Title",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }
}
