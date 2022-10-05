import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.Timer; 
import java.util.ArrayList;
  
public class Model implements ActionListener {
  State state;
  Timer timer;
  ArrayList<Controller> clients = new ArrayList<Controller>(); 
  public void register(Controller client) {
    this.clients.add(client);  
  }
  public Model(int delay, State state) {
    this.state = state; 
    this.timer = new Timer(delay, this); 
  }
  public void start() {
    this.timer.start();  
  }
  public void actionPerformed(ActionEvent e) {
    this.state.teh(); 
    // System.out.println("Howdy.");  
  }
}