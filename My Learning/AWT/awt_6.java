package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    Label l;
    TextArea tr;
    TextField tf;
    Button b;
    public MyFrame(){
        super("TextArea");
        l=new Label("Nothing is Enter");
        tf=new TextField(20);
        tr=new TextArea(10,30);
        b=new Button("Click");
        setLayout(new FlowLayout());
        add(l);
        add(tr);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        tr.insert(tf.getText(),tr.getCaretPosition());
    }
}
public class awt_6 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
