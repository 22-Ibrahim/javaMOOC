package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage arg0) {
        Button btn = new Button("Button on the left");
        
        Label label1 = new Label("Name:");
        TextField textField = new TextField ();
        FlowPane fp = new FlowPane();
        fp.getChildren().add(btn);
        fp.getChildren().addAll(label1,textField);
        Scene view = new Scene(fp);
        arg0.setScene(view);
        arg0.show();
    }

}
