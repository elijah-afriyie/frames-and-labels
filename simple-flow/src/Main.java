import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Create the main frame (window)
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
    frame.setSize(500, 500); // Set the size of the frame
    frame.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set the layout manager for the frame to FlowLayout

    // Create a panel
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(250, 250)); // Set the preferred size of the panel
    panel.setBackground(Color.LIGHT_GRAY); // Set the background color of the panel
    panel.setLayout(new FlowLayout()); // Set the layout manager for the panel to FlowLayout

    // Add buttons to the panel
    panel.add(new JButton("1"));
    panel.add(new JButton("2"));
    panel.add(new JButton("3"));
    panel.add(new JButton("4"));
    panel.add(new JButton("5"));
    panel.add(new JButton("6"));
    panel.add(new JButton("7"));
    panel.add(new JButton("8"));
    panel.add(new JButton("9"));
    panel.add(new JButton("10"));
    panel.add(new JButton("11"));

    // Add the panel to the frame
    frame.add(panel);
    // Make the frame visible
    frame.setVisible(true);
  }
}
