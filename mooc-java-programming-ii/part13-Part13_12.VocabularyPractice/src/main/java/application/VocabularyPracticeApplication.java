package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    private Dictionary dict;

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    public void init() {
        dict = new Dictionary();
    }
    @Override
    public void start(Stage stage) throws Exception {
        PracticeView pv = new PracticeView();
        InputView iv = new InputView();
        
        BorderPane layout =  new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button enterWords = new Button("Enter new words:");
        Button practice = new Button("Practice");
        
        menu.getChildren().addAll(enterWords, practice);
        layout.setTop(menu);

        
        enterWords.setOnAction((event) -> layout.setCenter(iv.getView()));
        practice.setOnAction((event) -> layout.setCenter(pv.getView()));
        
        layout.setCenter(iv.getView());
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
