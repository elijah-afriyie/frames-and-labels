import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JFrame frame;
  JComboBox comboBox;

  MyFrame() {
    frame = new JFrame("Frame Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    String[] favCars = { "Range Rover", "Escalade", "Land Cruiser" };
    comboBox = new JComboBox(favCars);
    comboBox.addActionListener(this);

    /* A few useful methods

    comboBox.setEditable(true);
    System.out.println("Item count is " + comboBox.getItemCount());
    comboBox.addItem("G Wargon");
    comboBox.insertItemAt("BMW M4", 0);
    comboBox.setSelectedIndex(0);
    comboBox.removeItem("G Wargon");
    comboBox.removeItemAt(0);
    comboBox.removeAllItems();
    
    */

    frame.add(comboBox);
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == comboBox) {
      System.out.println(
        "Your favorite car is " +
        comboBox.getSelectedItem() +
        ".\nIt's located at index " +
        comboBox.getSelectedIndex()
      );
    }
  }
}
