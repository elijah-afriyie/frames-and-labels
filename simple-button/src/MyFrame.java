import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JButton button;
  JLabel label;

  MyFrame() {
    ImageIcon clickIcon = new ImageIcon("click.png");
    ImageIcon broIcon = new ImageIcon("bro.png");

    label = new JLabel();
    label.setBounds(100, 180, 250, 200);
    label.setIcon(broIcon);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVisible(false);

    button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.setText("Click Me");
    button.setIcon(clickIcon);
    button.setFocusable(false);
    button.addActionListener(this);

    this.setTitle("My Awesome Title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setResizable(false);
    this.setSize(500, 500);
    this.setVisible(true);

    this.add(button);
    this.add(label);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      System.out.println("Button clicked!");
      label.setVisible(true);
      label.setText("Hey you, bro!");
      button.setEnabled(false);
    }
  }
}
