import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Create the frame
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new BorderLayout(10, 10));
    frame.setVisible(true);

    // ------------ Main panels ------------
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    // Set background colors
    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.yellow);
    panel4.setBackground(Color.magenta);
    panel5.setBackground(Color.blue);

    // Set preferred sizes
    panel1.setPreferredSize(new Dimension(100, 100));
    panel2.setPreferredSize(new Dimension(100, 100));
    panel3.setPreferredSize(new Dimension(100, 100));
    panel4.setPreferredSize(new Dimension(100, 100));
    panel5.setPreferredSize(new Dimension(100, 100));

    // Add main panels to the frame
    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.WEST);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.SOUTH);
    frame.add(panel5, BorderLayout.CENTER);

    // ------------ Sub panels ------------
    panel5.setLayout(new BorderLayout());

    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    // Set background colors
    panel6.setBackground(Color.black);
    panel7.setBackground(Color.darkGray);
    panel8.setBackground(Color.gray);
    panel9.setBackground(Color.lightGray);
    panel10.setBackground(Color.white);

    // Set preferred sizes
    panel6.setPreferredSize(new Dimension(50, 50));
    panel7.setPreferredSize(new Dimension(50, 50));
    panel8.setPreferredSize(new Dimension(50, 50));
    panel9.setPreferredSize(new Dimension(50, 50));
    panel10.setPreferredSize(new Dimension(50, 50));

    // Add sub panels to the center panel (panel5)
    panel5.add(panel6, BorderLayout.NORTH);
    panel5.add(panel7, BorderLayout.WEST);
    panel5.add(panel8, BorderLayout.EAST);
    panel5.add(panel9, BorderLayout.SOUTH);
    panel5.add(panel10, BorderLayout.CENTER);
  }
}
