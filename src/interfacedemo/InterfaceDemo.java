package interfacedemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterfaceDemo extends Application {
    
    @Override
    public void start(Stage stage) {
        RssView root = RssFactory.getRssView();
        
        Scene scene = new Scene(root, 700, 700);
        
        stage.setTitle("Rss Application");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
