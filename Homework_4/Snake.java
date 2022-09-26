import java.awt.*;
import java.util.*;

public class Snake extends ArrayList<Circle>{
    static final int RADIUS = 5;
    String direction = "stop";

    public Snake(){
        this.add(new Circle(200, 200, RADIUS, Color.BLACK));
        this.add(new Circle(200+1*RADIUS*2, 200, RADIUS, Color.RED));
        this.add(new Circle(200+2*RADIUS*2, 200, RADIUS, Color.ORANGE));
        this.add(new Circle(200+3*RADIUS*2, 200, RADIUS, Color.YELLOW));
        this.add(new Circle(200+4*RADIUS*2, 200, RADIUS, Color.GREEN));
        this.add(new Circle(200+5*RADIUS*2, 200, RADIUS, Color.CYAN));
        this.add(new Circle(200+6*RADIUS*2, 200, RADIUS, new Color(168, 50, 168)));
        this.add(new Circle(200+7*RADIUS*2, 200, RADIUS, Color.RED));
        this.add(new Circle(200+8*RADIUS*2, 200, RADIUS, Color.ORANGE));
        this.add(new Circle(200+9*RADIUS*2, 200, RADIUS, Color.YELLOW));
        this.add(new Circle(200+10*RADIUS*2, 200, RADIUS, Color.GREEN));
        this.add(new Circle(200+11*RADIUS*2, 200, RADIUS, Color.CYAN));
        this.add(new Circle(200+12*RADIUS*2, 200, RADIUS, new Color(168, 50, 168)));

    }

    public void draw(Graphics g){
        for(Circle c:this){
            c.draw(g);
        }
    }

    public void setDirection(String dir){
        this.direction=dir;
    }
    public void move(){
        if(this.direction.equalsIgnoreCase("north")||this.direction.equalsIgnoreCase("east")||this.direction.equalsIgnoreCase("south")||this.direction.equalsIgnoreCase("west")){
            int xPos = this.get(0).x;
            int yPos = this.get(0).y;

            if(this.direction.equalsIgnoreCase("north")){
                this.add(0, new Circle(xPos, yPos-RADIUS*2, RADIUS, Color.WHITE));
            }
            else if(this.direction.equalsIgnoreCase("east")){
                this.add(0, new Circle(xPos+RADIUS*2, yPos, RADIUS, Color.WHITE));
            }
            else if(this.direction.equalsIgnoreCase("south")){
                this.add(0, new Circle(xPos, yPos+RADIUS*2, RADIUS, Color.WHITE));
            }
            else if(this.direction.equalsIgnoreCase("west")){
                this.add(0, new Circle(xPos-RADIUS*2, yPos, RADIUS, Color.WHITE));
            }
            ((Circle)this.get(0)).setColor(Color.BLACK);
            ((Circle)this.get(1)).setColor(Color.RED);
            ((Circle)this.get(2)).setColor(Color.ORANGE);
            ((Circle)this.get(3)).setColor(Color.YELLOW);
            ((Circle)this.get(4)).setColor(Color.GREEN);
            ((Circle)this.get(5)).setColor(Color.CYAN);
            ((Circle)this.get(6)).setColor(new Color(168, 50, 168));
            ((Circle)this.get(7)).setColor(Color.RED);
            ((Circle)this.get(8)).setColor(Color.ORANGE);
            ((Circle)this.get(9)).setColor(Color.YELLOW);
            ((Circle)this.get(10)).setColor(Color.GREEN);
            ((Circle)this.get(11)).setColor(Color.CYAN);
            ((Circle)this.get(12)).setColor(new Color(168, 50, 168));
            this.remove(this.size()-1);
        }
    }
}
