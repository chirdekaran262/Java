package swingpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.NumberFormatter;
import javax.swing.tree.DefaultMutableTreeNode;

import java.util.*;

class MyFrame extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel label;

    public MyFrame(){
        super("Date format");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\Users\\KARAN\\OneDrive\\Desktop\\Myjava");
        File f=new File("C:\\Users\\KARAN\\OneDrive\\Desktop\\Myjava");

        for(File x:f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            }
            else 
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree=new JTree(root);
        label=new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp=new JScrollPane(tree);

        add(sp,BorderLayout.CENTER);
        add(sp,BorderLayout.SOUTH);
    }
    @Override
    public void valueChanged(TreeSelectionEvent e){
        label.setText(e.getPath().toString());
    }

}
public class swing_5 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
