package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox vb = new VBox();
        TextField tf = new TextField();
        
        
        Button btn = new Button("update");
        Label lb = new Label();
        btn.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                lb.setText(tf.getText());
            }
        });
        vb.getChildren().addAll(tf,btn,lb);
        
        Scene scene = new Scene(vb);
        window.setScene(scene);
        window.show();
    }

}
