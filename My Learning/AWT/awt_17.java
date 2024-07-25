package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    public MyFrame(){
        super("Menu");
        open=new MenuItem("Open");
        save=new MenuItem("Save");
        close=new MenuItem("Close");
        closeall=new MenuItem("CloseAll");

        file=new Menu("File");
        sub=new Menu("Sub");

        auto=new CheckboxMenuItem("Auto Save");

        file.add(open);
        file.add(save);
        file.add(close);
        file.add(closeall);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae)-> tf.setText("open"));
        save.addActionListener((ActionEvent ae)-> tf.setText("save"));
        close.addActionListener((ActionEvent ae)-> tf.setText("close"));
        closeall.addActionListener((ActionEvent ae)-> tf.setText("closeall"));

        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState())
                tf.setText("Auto on");
            else
                tf.setText("Auto off");
        });

        
    }
}

public class awt_17 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
