import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        HBox root = new HBox();
        VBox root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home");
        primaryStage.show();


    }
}
