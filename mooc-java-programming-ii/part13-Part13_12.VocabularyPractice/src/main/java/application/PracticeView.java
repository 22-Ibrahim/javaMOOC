/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ebrah
 */
public class PracticeView {
    private Dictionary dict;
    private String word;
    
    public PracticeView() {
        dict = new Dictionary();
        word = dict.random();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        TextField answerField = new TextField();
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        Button check = new Button("Check");
        Label feedback = new Label("");
        
        layout.add(wordInstruction, 0, 0);
        layout.add(answerField, 0, 1);
        layout.add(check, 0, 2);
        layout.add(feedback, 0, 3);

        check.setOnMouseClicked((event) -> {
            String userAnswer = answerField.getText();
            if (dict.get(this.word).equals(userAnswer)) {
                feedback.setText("Correct!");
            } else{
                feedback.setText("Incorrect! The translation for the word '" + word + "' is '" + dict.get(word) + "'.");
                return;
            }
            this.word = this.dict.random();
            wordInstruction.setText("Translate the word '" + this.word + "'");
            answerField.clear();
        });
        return layout;
    }
}

