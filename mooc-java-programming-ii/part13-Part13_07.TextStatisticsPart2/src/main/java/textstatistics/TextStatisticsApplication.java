package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea ta = new TextArea();
        layout.setCenter(ta);
        
        
        HBox bottom = new HBox();
        bottom.setSpacing(10);
        Label letter = new Label("Letters: " );
        
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        layout.setBottom(bottom);
        
        ta.textProperty().addListener((change, oldValue, newValue)-> {
        letter.setText("Letters: " + String.valueOf(newValue.length()));
        String [] parts = newValue.split(" ");
        words.setText("Words: " + String.valueOf(parts.length));
        longest.setText(("The longest word is: ") + Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                        .findFirst()
                        .get());
        
    });
        bottom.getChildren().addAll(letter, words, longest);
        layout.setBottom(bottom);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
