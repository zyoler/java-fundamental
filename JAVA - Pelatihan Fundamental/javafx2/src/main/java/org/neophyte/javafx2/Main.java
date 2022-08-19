package org.neophyte.javafx2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();

        root.setPadding(new Insets(20));

        Label label1 = new Label("Hello World");
        Button button1 = new Button("Buka stage baru");

        label1.setFont(new Font(32));

        root.getChildren().add(label1);
        root.getChildren().add(button1);

        Scene scene = new Scene(root, 256, 128);
        primaryStage.setScene(scene);
        primaryStage.show();

//        Stage stageBaru = new Stage();
//        stageBaru.show();

    }
}
