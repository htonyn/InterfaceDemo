package interfacedemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RssApp extends Application {
    @Override
    public void start(Stage stage) {
        RssView root = RssFactory.getRssView();
        
        Scene scene = new Scene(root, 700, 700);
        
        stage.setTitle("Rss Application");
        stage.setScene(scene);
        stage.show();
    }
}
