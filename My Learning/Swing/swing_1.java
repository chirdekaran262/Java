package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JButton b;
    JLabel l;
    int count=0;
    public MyFrame(){
        super("Swing");
        setLayout(new FlowLayout());
        b=new JButton("Click");
        l=new JLabel("Cliked "+count+" Times");

        add(l);
        add(b);
        b.addActionListener(this);
       // getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("images"));
    }
    public void actionPerformed(ActionEvent ae){
        count++;
        l.setText("Cliked "+count+" Times");
        l.setToolTipText("counter");
    }

}
public class swing_1 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
