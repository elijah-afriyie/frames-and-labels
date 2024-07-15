import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 * MyLable
 */
public class MyLabel extends JLabel {

  MyLabel() {
    this.setText("You will LOVE again, bro.");
    ImageIcon image = new ImageIcon("intimate.png");
    Border border = BorderFactory.createLineBorder(Color.black, 3);
    this.setIcon(image);
    this.setHorizontalTextPosition(JLabel.CENTER);
    this.setVerticalTextPosition(JLabel.BOTTOM);
    this.setHorizontalAlignment(JLabel.CENTER);
    this.setVerticalAlignment(JLabel.CENTER);
    this.setForeground(new Color(0x293329));
    this.setFont(new Font("Courier New", Font.BOLD, 20));
    // this.setBounds(50, 50, 500, 500); Commented out because I used the pack method
    // this.setIconTextGap(10);
    this.setBackground(Color.orange);
    this.setOpaque(true);
    this.setBorder(border);
  }
}
