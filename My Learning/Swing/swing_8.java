package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.NumberFormatter;

import java.util.*;

class MyFrame extends JFrame implements ListSelectionListener{
    JSplitPane ps;
    JList list;
    JLabel lbl;

    public MyFrame(){
        super("Split demo");
       
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};

        list=new JList(cols);
        list.setSelectedIndex(0);
        list.setListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);

        lbl=new JLabel("    ");
        lbl.setOpaque(true);
        list.setBackground(Color.red);
        JScrollPane p2=new JScrollPane(lbl);

        JTabbedPane tp=new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label", p2);
        add(tp);
    }
    @Override
    public void valueChanged(ListSelectionEvent  e){
        String str=(String)list.getSelectedValue();
        switch (str) {
            case "RED":
                lbl.setBackground(Color.red);
                break;
            case "GREEN":
                lbl.setBackground(Color.green);
                break;
            case "BLUE":
                lbl.setBackground(Color.blue);
                break;
            case "YELLOW":
                lbl.setBackground(Color.yellow);
                break;
            case "MAGENTA":
                lbl.setBackground(Color.magenta);
                break;
            case "ORANGE":
                lbl.setBackground(Color.orange);
                break;
            case "BLACK":
                lbl.setBackground(Color.BLACK);
                break;
        }
    }

}
public class swing_8{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
