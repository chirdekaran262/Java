package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    Label l1;
    Label l2;
    TextField tf;
    public MyFrame(){
        super("Textfield");
       
        l1=new Label("Nothing is Entered");
        l2=new Label("Enter text");
        tf=new TextField(20);
        tf.setEchoChar('*');
        Innerawt_5 ia=new Innerawt_5();
        tf.addActionListener(ia);
        tf.addTextListener(ia);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
    
    /**
     * Innerawt_5
     */
    public class Innerawt_5 implements TextListener,ActionListener{
    
        public void textValueChanged(TextEvent te){
        l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent ae){
        l2.setText(tf.getText());
    }
    }
    
}
public class awt_5 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
