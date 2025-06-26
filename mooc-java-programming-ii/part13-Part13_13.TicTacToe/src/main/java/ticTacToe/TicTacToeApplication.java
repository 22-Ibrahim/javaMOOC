package ticTacToe;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    private boolean xTurn = true;
    private Button[][] buttons = new Button[3][3];
    private Label turn = new Label("Turn: X");

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        
        GridPane grid = new GridPane();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button();
                button.setPrefSize(100, 100);
                int r = row;
                int c = col;
                button.setOnAction(e -> handleMove(button, r, c));
                buttons[row][col] = button;
                grid.add(button, col, row);
            }
        }
        
        layout.setTop(this.turn);
        layout.setCenter(grid);
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setTitle("Nic Nac Noe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleMove(Button button, int row, int col) {
        
        if (!button.getText().isEmpty()) return;
        turn.setText(xTurn ? "Turn: O"  : "Turn: X" );
        button.setText(xTurn ? "X" : "O");
        
        if (checkWin()) {
            showAlert((xTurn ? "X" : "O") + " wins!");
            resetGame();
        } else if (isBoardFull()) {
            showAlert("It's a draw!");
            resetGame();
        } else {
            xTurn = !xTurn;
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // Rows and Columns
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2]) ||
                checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) {
                turn.setText(xTurn ? "Turn: O"  : "Turn: X" );
                return true;
            }
        }
        // Diagonals
        if( checkLine(buttons[0][0], buttons[1][1], buttons[2][2]) ||
               checkLine(buttons[0][2], buttons[1][1], buttons[2][0])){
            turn.setText("The end!" );
            return true;
        }
        return false;
    }

    private boolean checkLine(Button b1, Button b2, Button b3) {
        String t1 = b1.getText();
        return !t1.isEmpty() && t1.equals(b2.getText()) && t1.equals(b3.getText());
    }

    private boolean isBoardFull() {
        for (Button[] row : buttons) {
            for (Button b : row) {
                if (b.getText().isEmpty()) return false;
            }
        }
        return true;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void resetGame() {
        for (Button[] row : buttons) {
            for (Button b : row) {
                b.setText("");
            }
        }
        xTurn = true;
        turn.setText(xTurn ? "X turn"  : "O turn" );

    }
}
