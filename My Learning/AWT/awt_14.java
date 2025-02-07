package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Button b1,b2,b3;
    TextField t1,t2,t3;
    Panel p1,p2,cp;
    Panel mainp;
    Checkbox c1,c2;
    CardLayout cl;

    public MyFrame(){
        super("CardLayout Demo");
        CheckboxGroup cg=new CheckboxGroup();

        c1=new Checkbox("one",true,cg);
        c2=new Checkbox("one",true,cg);

        c1.addItemListener(this);
        c1.addItemListener(this);

        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        
        cp=new Panel();
        cp.add(c1);
        cp.add(c2);

        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b2);

        p2=new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp=new Panel();
        cl=new CardLayout();
        mainp.setLayout(cl);

        mainp.add("one",p1);
        mainp.add("two",p2);

        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);

    }

    public void itemStateChanged(ItemEvent ie){
        if(c1.getState())
            cl.first(mainp);
        else
            cl.last(mainp);
    }
    
}
public class awt_14 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
