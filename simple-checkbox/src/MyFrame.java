import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JFrame frame = new JFrame();
  JCheckBox checkBox = new JCheckBox("I'm not a robot");
  JButton button = new JButton("Submit");

  MyFrame() {
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Arial", Font.PLAIN, 18));

    button.setFont(new Font("Arial", Font.PLAIN, 18));
    button.setFocusable(false);
    button.addActionListener(this);

    frame.setTitle("My Awesome Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    frame.add(checkBox);
    frame.add(button);

    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      System.out.println(checkBox.isSelected());
    }
  }
}
