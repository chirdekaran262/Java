package Myfirstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    int x=0,y=0;
    public MyFrame(){
        super("Painting");
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me){
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });

    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Romen",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
    
}
public class awt_18 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}

