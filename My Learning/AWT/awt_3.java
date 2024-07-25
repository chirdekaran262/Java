package Myfirstapp;
import java.awt.*;
import java.awt.event.*;
import java.nio.Buffer;
class MyFrame extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;
    public MyFrame(){
        super("Counting App");
        l=new Label("    "+0);
        b=new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
    public  void actionPerformed(ActionEvent e){
        count++;
        l.setText("  "+count);
    }
}

public class awt_3 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
