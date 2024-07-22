import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int response = JOptionPane.showConfirmDialog(
      null,
      "Bro, do you even code?",
      "Coding Title",
      JOptionPane.YES_NO_CANCEL_OPTION
    );

    switch (response) {
      case (0):
        System.out.println("You selected Yes");
        break;
      case (1):
        System.out.println("You selected No");
        break;
      case (2):
        System.out.println("You selected Cancel");
        break;
      case (-1):
        System.out.println(
          "You closed the window without selecting any option"
        );
        break;
    }
  }
}
