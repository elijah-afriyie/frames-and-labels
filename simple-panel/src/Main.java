import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

  public static void main(String[] args) throws Exception {
    ImageIcon icon = new ImageIcon("bro.png");

    JFrame frame = new JFrame();
    frame.setTitle("My Awesome Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(750, 750);
    frame.setVisible(true);
    frame.setLayout(null);

    // Create panels
    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(0, 0, 250, 250);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(250, 0, 250, 250);

    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0, 250, 500, 250);
    greenPanel.setLayout(new BorderLayout());

    // Create labels
    JLabel label = new JLabel();
    label.setText("Hello, bro!");
    label.setIcon(icon);
    // label.setVerticalAlignment(JLabel.CENTER);
    // label.setHorizontalAlignment(JLabel.CENTER);

    // Add panel to frame
    frame.add(bluePanel);
    frame.add(redPanel);
    frame.add(greenPanel);

    // Add label to green panel
    greenPanel.add(label);
    label.setBounds(50, 50, 100, 100);
  }
}
