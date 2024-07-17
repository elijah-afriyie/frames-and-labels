import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame {

  JButton button;

  MyFrame() {
    ImageIcon icon = new ImageIcon("click.png");
    button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.setText("Click Me");
    button.setIcon(icon);
    button.addActionListener(e -> System.out.println("You clicked on a button, Bro!"));

    this.setTitle("My Awesome Title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setResizable(false);
    this.setSize(500, 500);
    this.setVisible(true);

    this.add(button);
  }
}
