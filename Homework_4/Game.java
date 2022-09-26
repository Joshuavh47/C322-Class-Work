import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Game implements World{
    Snake snake = new Snake();

    public Game(){

    }

    @Override
    public void draw(Graphics g) {
        this.snake.draw(g);
    }

    @Override
    public void update() {
        this.snake.move();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==38){
            this.snake.setDirection("north");
        }
        else if(e.getKeyCode()==39){
            this.snake.setDirection("east");
        }
        else if(e.getKeyCode()==40){
            this.snake.setDirection("south");
        }
        else if(e.getKeyCode()==37){
            this.snake.setDirection("west");
        }
        else{
            if(e.getKeyChar()=='8'){
                this.snake.setDirection("north");
            }
            else if(e.getKeyChar()=='6'){
                this.snake.setDirection("east");
            }
            else if(e.getKeyChar()=='2'){
                this.snake.setDirection("south");
            }
            else if(e.getKeyChar()=='4'){
                this.snake.setDirection("west");
            }
            else if(e.getKeyChar()=='5'){
                this.snake.setDirection("stop");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
    public static void main(String[] args){
        BigBang b = new BigBang(new Game());
        b.start(200,500);
    }
}
