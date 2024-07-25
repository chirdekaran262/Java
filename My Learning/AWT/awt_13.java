package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener{
    Label l;
    public MyFrame(){
        super("Window Event Demo");
        l=new Label("No massage from window");

        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent we){
        l.setText("Window Opened");
    }
    public void windowClosing(WindowEvent we){
        l.setText("Window Closing");
    }
    public void windowClosed(WindowEvent we){
        l.setText("Window Closed");
    }
    public void windowIconified(WindowEvent we){
        l.setText("Window Iconified");
    }
    public void windowDeiconified(WindowEvent we){
        l.setText("Window Deconified");
    }
    public void windowActivated(WindowEvent we){
        l.setText("Window Activated");
    }
    public void windowDeactivated(WindowEvent we){
        l.setText("Window Deactivated");
    }
    
}
public class awt_13 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
