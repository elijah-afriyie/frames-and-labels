import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JButton button;

  MyFrame() {
    ImageIcon icon = new ImageIcon("click.png");
    button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.setText("Click Me");
    button.setIcon(icon);
    button.setFocusable(false);
    button.addActionListener(this);

    this.setTitle("My Awesome Title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setResizable(false);
    this.setSize(500, 500);
    this.setVisible(true);

    this.add(button);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      System.out.println("Button clicked!");
    }
  }
}
