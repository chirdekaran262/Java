package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame(){
        super("TextArea");
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");
        
        /*FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.set
        setLayout(fl);*/
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.CENTER);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        //add(b5);
        //add(b6);
        Panel p=new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("wed"));
        add(p,BorderLayout.EAST);
    }
    
}
public class awt_9 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
