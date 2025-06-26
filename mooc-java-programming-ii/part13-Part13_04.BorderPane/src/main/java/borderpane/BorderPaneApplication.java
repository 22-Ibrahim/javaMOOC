package borderpane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage arg0) {
        
        BorderPane bp = new BorderPane();
        bp.setBottom(new Label("SOUTH"));
        bp.setTop(new Label("NORTH"));
        bp.setRight(new Label("EAST"));
        Scene view = new Scene(bp);
        arg0.setScene(view);
        arg0.show();
    }

}
