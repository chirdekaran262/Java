package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.util.*;

class MyInternalFrame extends JInternalFrame {
    static int count=0;
    JTextArea ta;
    JScrollPane sp;

    public MyInternalFrame(){
        super("Documents"+(++count),true,true,true,true);
        ta=new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setMenuBar(mb);

        setSize(300,300);
        setLocation(50, 50);
        setVisible(true);
    }

}

class MyFrame extends JFrame implements ActionListener{
    JDesktopPane dp;

    public MyFrame(){
        super("Internal Frame demo");
        dp=new JDesktopPane();
        setContentPane(dp);

        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem m1=new JMenuItem("new");

        d.add(m1);
        mb.add(d);
        //setMenuBar(mb);

        m1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        MyInternalFrame mi=new MyInternalFrame();
        dp.add(mi);
    }

}
public class swing_7{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
