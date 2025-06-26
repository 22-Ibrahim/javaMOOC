package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage arg) {
        Label label = new Label("Label on the left");
        Button btn = new Button("Button on the right");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(btn);
        fp.getChildren().add(label);
        Scene view = new Scene(fp);
        
        arg.setScene(view);
        arg.show();
    }

}
