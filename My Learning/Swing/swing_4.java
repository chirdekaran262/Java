package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.NumberFormatter;

import java.util.*;

class MyFrame extends JFrame {
    JTextField tf;
    JLabel l;
    JButton b;
    JPanel p;
    public MyFrame(){
        super("BOrder format");
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Login", TitledBorder.CENTER, TitledBorder.LEFT);
        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);
        
    }

}
public class swing_4 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
