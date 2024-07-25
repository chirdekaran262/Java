package javafx;
import java.awt.Image;
import java.awt.ScrollPane;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.text.html.ImageView;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class javafx_5 extends Application {
    @Override
    public void start(Stage stage)throws Exception{
        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;
        ImageView iv4=null;

        iv1=new ImageView(new Image(new FileImageInputStream("Images/eiffel.jpg")));
        iv2=new ImageView(new Image(new FileImageInputStream("Images/liberty.jpg")));
        iv3=new ImageView(new Image(new FileImageInputStream("Images/qutub.jpg")));

        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);

        TitledPane t1=new TitledPane("Eiffel",sp1);
        TitledPane t2=new TitledPane("Liberty",sp2);
        TitledPane t3=new TitledPane("Qutub",sp3);

        Accordion root=new Accordion();
        root.getPanes().addAll(t1,t2,t3);

        Scene sc=new Scene(root,400,400);

        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
