import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Create a JLayeredPane
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0, 0, 500, 500);

    // Create the main frame (window)
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
    frame.setSize(500, 500); // Set the size of the frame
    frame.setLayout(null); // Use absolute positioning
    frame.add(layeredPane); // Add the layeredPane to the frame

    // Create and configure label1
    JLabel label1 = new JLabel();
    label1.setOpaque(true);
    label1.setBackground(Color.RED);
    label1.setBounds(50, 50, 200, 200);

    // Create and configure label2
    JLabel label2 = new JLabel();
    label2.setOpaque(true);
    label2.setBackground(Color.GREEN);
    label2.setBounds(100, 100, 200, 200);

    // Create and configure label3
    JLabel label3 = new JLabel();
    label3.setOpaque(true);
    label3.setBackground(Color.BLUE);
    label3.setBounds(150, 150, 200, 200);

    // Add labels to the layeredPane
    layeredPane.add(label1, Integer.valueOf(0));
    layeredPane.add(label2, Integer.valueOf(2));
    layeredPane.add(label3, Integer.valueOf(1));

    // Make the frame visible
    frame.setVisible(true);
  }
}
