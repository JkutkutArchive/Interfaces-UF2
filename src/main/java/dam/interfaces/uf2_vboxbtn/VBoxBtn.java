package dam.interfaces.uf2_vboxbtn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VBoxBtn extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VBoxBtn.class.getResource("app.fxml"));
        AnchorPane root = fxmlLoader.load();
        Scene scene = new Scene(root, 600 , 400);
        stage.setTitle("VBox + Button");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}