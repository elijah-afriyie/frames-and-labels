import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame {

  MyFrame() {
    this.setTitle("My Awesome Title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(700, 700);
    // this.setLayout(null); Commented out because I used the pack method
  }
}
