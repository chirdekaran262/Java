package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public MyFrame(){
        super("CheckBox");
        //cbg=new CheckboxGroup();
        l=new Label("Nothing is selected");
        c1=new Checkbox("Java");//,false,cbg);
        c2=new Checkbox("Python");//,false,cbg);
        c3=new Checkbox("C#");//,false,cbg);
        c1.addItemListener(this);
        c1.addItemListener(this);
        c1.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        String st=" ";
        if(c1.getState())
            st=st+" "+c1.getLabel();
        if(c2.getState())
            st=st+" "+c2.getLabel();
        if(c3.getState())
            st=st+" "+c3.getLabel();
        if(st.isEmpty())
            st="Nothing is selected";
        l.setText(st);
        
    }
}
public class awt_4 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
