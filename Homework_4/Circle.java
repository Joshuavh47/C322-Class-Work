import java.awt.*;

class Circle {
    int x;
    int y;
    int radius;
    Color color;
    Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x - this.radius,this.y - this.radius, this.radius * 2, this.radius * 2);
        g.setColor(Color.BLACK);
        g.drawOval(this.x - this.radius,this.y - this.radius, this.radius * 2, this.radius * 2);
    }
    public void setColor(Color c){
        this.color=c;
    }
}