package Myfirstapp;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4;

    public MyFrame(){
        super("Key Event Demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        setLayout(null);

        l1.setBounds(30,20,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,80,100,20);
        l4.setBounds(30,110,100,20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);

    }
    public void keyPressed(KeyEvent ke){
        l1.setText("Key Pressed");
        l2.setText("");
        
    }
    public void keyReleased(KeyEvent ke){
        l2.setText("Key Relesead");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    public void keyTyped(KeyEvent ke){
        l3.setText("Key Typed");
        l4.setText(new Date(ke.getWhen())+"");
    }
    
}
public class awt_11 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
