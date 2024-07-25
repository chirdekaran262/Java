package javafx;
import java.net.URL;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class javafx_2 extends Application{
    Button b1;
    int count=0;
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader ld=new FXMLLoader();
        id.setLocation(new URL("FXMLTest.fxml"));
        Vbox vd=id.<Vbox>load();

        Scene sc=new Scene(vb,400,400);
        stage.setScene(sc);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
