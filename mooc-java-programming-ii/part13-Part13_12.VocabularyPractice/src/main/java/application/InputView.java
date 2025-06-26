/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ebrah
 */
public class InputView {
    
    private Dictionary dict;
    
    public InputView(){
        dict = new Dictionary();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        Label wordInstruction = new Label("Word");
        TextField wordField = new TextField();
        Label translationInstruction = new Label("Translation");
        TextField translationField = new TextField();
        
        Button add = new Button("Add the word pair");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        layout.add(wordInstruction, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translationInstruction, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(add, 0, 4);
        
        add.setOnMouseClicked((event) -> {
            String word = wordField.getText();
            String translation = translationField.getText();
            dict.add(word, translation);
            
            wordField.clear();
            translationField.clear();
        });
        
        return layout;
    }
    
}
