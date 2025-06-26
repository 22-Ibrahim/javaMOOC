package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label lb = new Label("Enter your name and start.");
        TextField tf = new TextField();
        Button start = new Button("Start");
        VBox vb = new VBox();
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.setSpacing(10);
        vb.getChildren().addAll(lb, tf, start);
        Scene first = new Scene(vb);
        
        Label welcome = new Label();
        Scene second = new Scene(welcome);
        
        start.setOnAction(event -> {
            welcome.setText("Welcome " + tf.getText() + "!");
            window.setScene(second);
        });
        
        window.setScene(first);
        window.show();
    }
}
