package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener{
    List l;
    Choice c;
    TextArea ta;
    public MyFrame(){
        super("CheckList");
        l=new List(4,true);
        ta=new TextArea(10,30);
        c=new Choice();
        setLayout(new FlowLayout());
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wensday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Juanuary");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }
    public void actionPerformed(ActionEvent ae){
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
            txt+=x+"\n";
        ta.setText(txt);
    }
    
}
public class awt_7 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
