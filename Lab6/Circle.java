import java.awt.Graphics; 

public class Circle implements Avatar {
  String name; 
  int x, y, radius;
  public Circle(String name, int x, int y, int radius) {
    this.x = x; 
    this.y = y; 
    this.radius = radius; 
    this.name = name;
  }
  public void draw(Graphics g) {
    g.drawOval(this.x - this.radius, this.y - this.radius, this.radius * 2, this.radius * 2); 
    g.drawString(this.name, this.x - 15, this.y + 5); 
  }
}