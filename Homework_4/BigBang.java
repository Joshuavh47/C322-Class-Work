import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BigBang extends JComponent implements KeyListener, ActionListener, MouseListener {
    Timer timer;
    World world;
    public BigBang(World world) {
        this.world = world;
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }
    public void start(int delay, int size) {
        JFrame frame = new JFrame();
        frame.add(this);
        frame.setVisible(true);
        frame.setSize(size, size);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.timer=new Timer(delay, this);
        this.timer.start();

    }

    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) {
        world.mousePressed(e);
        this.repaint();
    }
    public void mouseReleased(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }

    public void keyPressed(KeyEvent e) {
        this.world.keyPressed(e);
        this.repaint();
    }
    public void keyReleased(KeyEvent e) { }
    public void keyTyped(KeyEvent e) { }
    public void paintComponent(Graphics g) {
        this.world.draw(g);
    }
    public void actionPerformed(ActionEvent e) {
        this.world.update();
        this.repaint();
    }

}