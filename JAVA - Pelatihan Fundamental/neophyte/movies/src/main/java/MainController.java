import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainController {

    @FXML
    Button homeButton;

    @FXML
    Button movieButton;

    @FXML
    AnchorPane content;

    void setPage(String nama) {
        VBox root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/pages/" + nama + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        content.getChildren().setAll(root);
    }

    @FXML
    void initialize(){
        System.out.println("Halaman ini sudah ditampilkan");

        setPage("home");

        homeButton.setOnAction(event -> {
            setPage("home");
        });

        movieButton.setOnAction(event -> {
            setPage("movie");
        });
    }



//    @FXML
//    void initialize() {
//        System.out.println("Halaman ini sudah ditampilkan");
//
//        homeButton.setOnAction(event -> {
//            VBox root = null;
//            try {
//                root = FXMLLoader.load(getClass().getResource("/pages/movie.fxml"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            content.getChildren().setAll(root);
//        });
//
//        movieButton.setOnAction(event -> {
//            VBox root = null;
//            try {
//                root = FXMLLoader.load(getClass().getResource("/pages/movie.fxml"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            content.getChildren().setAll(root);
//        });
//    }


}
