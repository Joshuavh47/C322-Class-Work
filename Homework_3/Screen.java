import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {
    User owner;
    JTextField input;
    JPanel panel;
    JLabel label;
    JButton button;
    JTextArea charArea;
    public Screen(User owner){
        this.owner = owner;
        this.input = new JTextField();
        this.input.setPreferredSize(new Dimension(80,20));

        this.label = new JLabel(this.owner.name);
        this.button = new JButton("Send");
        this.button.addActionListener(this);

        this.charArea = new JTextArea(20,20);
        this.charArea.setEditable(false);

        this.panel = new JPanel();
        this.panel.add(this.label);
        this.panel.add(this.input);
        this.panel.add(this.button);
        this.panel.add(this.charArea);

        this.add(this.panel);

        this.charArea.append("Welcome to the Chat!\n");

        this.setSize(300,550);
        this.setVisible(true);
    }
    public void addMessage(String message){
        this.charArea.append(message + "\n");
    }
    public void actionPerformed(ActionEvent e){
        this.owner.broadcast(this.input.getText());
        this.input.setText("");
    }
}