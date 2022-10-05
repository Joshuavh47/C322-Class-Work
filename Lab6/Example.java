import java.awt.Dimension; 

class Example {
  public static void main(String[] args) {
    Model world = new Game(100, new Counter<Circle>());  
    Controller p1 = new Player("Larry", world, new Dimension(300, 200), new Screen()); 
    Controller p2 = new Player("Leslie", world, new Dimension(300, 200), new Screen()); 
    Controller p3 = new Player("Laura", world, new Dimension(300, 200), new Screen()); 
    world.start();
  }
}