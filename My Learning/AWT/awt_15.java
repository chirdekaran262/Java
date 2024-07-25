package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{

    public MyFrame(){
        super("Adaptor Demo");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
    });
        
        
    }
    
}
public class awt_15 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}

