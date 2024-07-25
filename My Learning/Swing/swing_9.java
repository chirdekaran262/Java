package swingpack;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


class MyFrame extends JFrame implements ChangeListener {
    JSlider sl;
    JPanel p1,p2;
    JProgressBar pb;

    int w=50;

    public MyFrame(){

        sl=new JSlider(0,100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(10);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb=new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);

        p1=new JPanel(){
            public void paintComponent(Graphics g){
                g.drawOval(200,200,w,w);
            }
        };
        p2=new JPanel();
        p2.add(pb);

        add(sl,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        sl.addChangeListener(this);
      
    }

    @Override
    public void stateChanged(ChangeEvent e){
        w=sl.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
    }

}



public class swing_9{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
