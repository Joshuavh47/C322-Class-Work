import java.awt.event.*; 

public class Game extends Model {
  public Game(int delay, State state) {
    super(delay, state); 
  }
  public void actionPerformed(ActionEvent e) {
    super.actionPerformed(e);
    // System.out.println( this.state ); 
    for (Controller c : this.clients) {
      c.teh(this.state);  
    }
  }
}