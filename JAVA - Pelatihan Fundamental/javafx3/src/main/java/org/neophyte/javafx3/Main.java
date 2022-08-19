package org.neophyte.javafx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/index.fxml"));

        Scene scene = new Scene((Parent) loader.load(),256,128);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
