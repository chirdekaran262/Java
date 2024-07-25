package swingpack;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;


class MyFrame extends JFrame implements ActionListener {
    JLabel l;

    public MyFrame(){

        String[] cities={"New York","Delhi","Paris","Berlin"};

        JComboBox cb=new JComboBox<>(cities);
        cb.setSelectedIndex(0);
        cb.setEditable(true);
        cb.addActionListener(this);

        l=new JLabel();

        l.setIcon(new ImageIcon("Images"));
        setLayout(new FlowLayout());
        add(cb);
        add(l);
    }

    
    public void actionPerformed(ActiveEvent e){
        JComboBox cb=(JComboBox)e.getSource();
        String name=(String)cb.getSelectedItem();
        ImageIcon icon=new ImageIcon("Images");

        l.setIcon(icon);
        String s=(String)cb.getSelectedItem();
        for(int i=0;i<cb.getItemCount();i++){
            if(s.equals(cb.getItemAt(i)))
                return;
        }
        cb.addItem(s);

    }

}



public class swing_10{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
