package javafx;

import java.awt.Color;
import java.nio.Buffer;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
public class javafx_1 extends Application {
    public void start(Stage stage) throws Exception{
        Button b=new Button("Click_Me");
        b.setTextFill(Color.BLUE);
        b.setMnemonic(true);
        Tooltip tp=new Tooltip("Click this Button");
        b.setTooltip(tp);
        Alert a=new Alert(AlertType.INFORMATION,"Button is clicked");

        b.setOneAction(e->a.show());

        FlowPane fp=new FlowPane(b);
        Scene sc=new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
