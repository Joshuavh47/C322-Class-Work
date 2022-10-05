import java.awt.Dimension; 
import java.awt.event.KeyEvent;

public class Player extends Controller {
  String name; 
  int x, y, radius;
  public Player(String name, Model world, Dimension size, View view) {
    super(world, size, view); 
    this.name = name; 
    this.setTitle( this.name ); 
    this.x = (int)(Math.random() * 100); 
    this.y = (int)(Math.random() * 100); 
    this.radius = 20; 
    ((Counter<Circle>)this.world.state).update(this, new Circle(this.name, this.x, this.y, this.radius)); 
  }
  public void teh(State state) {
    // System.out.println( this.name + ": " + state );  
    this.view.set(state); 
    this.view.repaint(); 
  }
  public void keh(KeyEvent e) {
    // System.out.println(this.name + " says " + e.getKeyCode());  
    int code = e.getKeyCode(); 
    if (code == 37) { this.x -= 5; } // west 
    else if (code == 38) { this.y -= 5; } // north 
    else if (code == 39) { this.x += 5; } // east 
    else if (code == 40) { this.y += 5; } // south 
    else { }    
    ((Counter<Circle>)this.world.state).update(this, new Circle(this.name, this.x, this.y, this.radius)); 
    this.teh(this.world.state); 
  }
  
}