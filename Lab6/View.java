import javax.swing.JComponent;
import java.awt.Graphics; 

public class View extends JComponent {
  Controller controller; 
  State state;
  public void setController(Controller controller) {
    this.controller = controller;  
  }
  public void set(State state) {
    this.state = state;  
  }
  public void paintComponent(Graphics g) {
    if (this.state != null) 
      this.state.draw(g);  
  }
}