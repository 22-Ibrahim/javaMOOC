package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane bp = new BorderPane();
        
        Button one = new Button("Joke");
        Button two = new Button("Answer");
        Button three = new Button("Explanation");
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        menu.getChildren().addAll(one, two, three);
        bp.setTop(menu);
        
        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane expln = createView("You figure it yourself!");
        
        one.setOnAction(event ->{
            bp.setCenter(joke);
        });
        two.setOnAction(event ->{
            bp.setCenter(answer);
        });
        three.setOnAction(event->{
            bp.setCenter(expln);
        });
        
        bp.setCenter(joke);
        
        Scene scene = new Scene(bp);
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
