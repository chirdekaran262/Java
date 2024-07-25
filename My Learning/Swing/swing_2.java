package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.util.*;

class MyFrame extends JFrame {
    
    public MyFrame(){
        super("Date format");
        JTextField tf1=new JTextField(20);
        DateFormat d=new SimpleDateFormat("dd/mm/yyyy");
        JFormattedTextField tf2=new JFormattedTextField(d);
        tf2.setColumns(20);
        tf2.setValue(new Date());
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft=new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000000);
        JFormattedTextField tf3=new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(3040284);
        JTextArea ta=new JTextArea();
        add(ta);
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
    }

}
public class swing_2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
