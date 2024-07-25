package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame(){
        super("TextArea");
        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gs=new GridBagConstraints();

        setLayout(gb);
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");
        
        gs.gridy=1;
        gs.gridy=1;
        
        add(b1,gs);
        gs.gridy=2;
        gs.gridy=1;
        add(b2,gs);
        gs.gridy=1;
        gs.gridy=2;
        add(b3,gs);
        gs.gridy=2;
        gs.gridy=2;
        add(b4,gs);
        gs.gridy=3;
        gs.gridy=1;
        add(b5,gs);
        gs.gridy=3;
        gs.gridy=2;
        add(b6,gs);
        
        
    }
    
}
public class awt_10 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
