package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label fv = new Label("First view!");
        Button swtch = new Button("To the second view!");
        BorderPane bp = new BorderPane();
        bp.setTop(fv);
        bp.setCenter(swtch);
        Scene first = new Scene(bp);
        
        Button toThird = new Button("To the third view!");
        Label sv = new Label("Second view!");
        VBox vb = new VBox();
        vb.getChildren().addAll(toThird, sv);
        Scene second = new Scene(vb);
        
        GridPane layout = new GridPane();
        Label thirdView = new Label("Third view!");
        Button toFirst = new Button("To the first view!");
        layout.add(thirdView, 0, 0);
        layout.add(toFirst, 1, 1);
        Scene third = new Scene(layout);

        swtch.setOnAction(event -> {
           window.setScene(second) ;
           
        });
        
        toThird.setOnAction(event -> {
            window.setScene(third);
        });
        
        toFirst.setOnAction(event -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }

}
