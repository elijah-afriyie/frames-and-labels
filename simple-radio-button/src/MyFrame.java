import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JFrame frame;

  JRadioButton toyota;
  JRadioButton rangeRover;
  JRadioButton cardilac;

  MyFrame() {
    frame = new JFrame("My Favorite Car Manufacturer");

    toyota = new JRadioButton("Toyota");
    rangeRover = new JRadioButton("Range Rover");
    cardilac = new JRadioButton("Cardilac");

    toyota.addActionListener(this);
    rangeRover.addActionListener(this);
    cardilac.addActionListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    ButtonGroup btnGroup = new ButtonGroup();
    btnGroup.add(toyota);
    btnGroup.add(rangeRover);
    btnGroup.add(cardilac);

    frame.add(toyota);
    frame.add(rangeRover);
    frame.add(cardilac);

    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == toyota) {
      System.out.println("Toyota is my favorite car manufacturer");
    } else if (e.getSource() == rangeRover) {
      System.out.println("Range Rover is my favorite car manufacturer");
    } else if (e.getSource() == cardilac) {
      System.out.println("Cardilac is my favorite car manufacturer");
    }
  }
}
