import java.awt.Dimension; 
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controller implements KeyListener {
  Model world; 
  View view; 
  JFrame frame; 
  public Controller(Model world, Dimension size, View view) {
    this.world = world; 
    this.world.register(this); 
    frame = new JFrame(); 
    frame.setSize(size); 
    frame.setVisible(true); 
    this.view = view;
    this.view.setController(this); 
    frame.add(this.view); 
    frame.addKeyListener(this); 
  }
  public void keyPressed(KeyEvent e) { 
    this.keh(e); 
  } // System.out.println("Pressed."); } 
  public void keh(KeyEvent e) { } 
  public void keyReleased(KeyEvent e) { } // System.out.println("Released."); } 
  public void keyTyped(KeyEvent e) { } // System.out.println("Typed."); } 
  public void setTitle(String title) {
    this.frame.setTitle(title);  
  }
  public void teh(State state) { 
    // System.out.println("How are you?"); 
  }
}