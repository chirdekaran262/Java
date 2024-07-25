package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    TextField tf;
    Button b;
    int count=0;
    public MyFrame(){
        super("Demo");

        b=new Button("Click");
        tf=new TextField("0",20);

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener((ActionEvent ae)->{
            count++;
            tf.setText(String.valueOf(count));
            
        });
    }
}

public class awt_16 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
