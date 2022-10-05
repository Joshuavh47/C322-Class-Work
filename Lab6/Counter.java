import java.awt.Graphics; 
import java.util.ArrayList;
import java.util.Map; 
import java.util.HashMap; 

class Counter<T extends Avatar> implements State {
  int count = 0;
  Map<Controller, T> states = new HashMap<Controller, T>(); 
  public void teh() {
    this.count += 1;  
  }
  public void update(Controller controller, T avatar) {
    this.states.put(controller, avatar);  
  }
  public String toString() {
    return this.count + "";  
  }
  public void draw(Graphics g) {
    g.drawString("World time: " + this.count + "",  5, 15); 
    ArrayList<T> circles = new ArrayList<T>(); 
    for (Controller c : states.keySet())
      circles.add(states.get(c));
    for (T c : circles)
      c.draw(g); 
  }
}