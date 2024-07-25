package Myfirstapp;
import java.awt.*;
class awt_1{
    public static void main(String[] args) {
        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout());
        Button b=new Button("OK");
        Label l=new Label("Name");
        TextField tf=new TextField(20);
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setVisible(true);
        f.setSize(500,500);
    }
}