package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea(""));
        HBox bottom = new HBox();
        bottom.setSpacing(10);
        bottom.getChildren().add(new Label("Letters: 0"));
        bottom.getChildren().add(new Label("Words: 0"));
        bottom.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(bottom);
         Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
