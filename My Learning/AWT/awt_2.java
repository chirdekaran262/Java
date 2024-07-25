package Myfirstapp;
import java.awt.*;

class myapp extends Frame{
    Label l;
    TextField tf;
    Button b;
    public myapp(){
        super("My App");
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
}

public class awt_2 {
    public static void main(String[] args) {
        myapp m=new myapp();
        m.setSize(600,600);
        m.setVisible(true);
    }
}
