/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    MyFrame frame = new MyFrame();
    MyLabel label = new MyLabel();

    frame.add(label); // Make sure to add all components before using pack
    frame.pack();
    frame.setVisible(true);
  }
}
