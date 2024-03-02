package tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GameController {
	@FXML private GridPane gridPane;
	@FXML private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private Alert alert;
	protected static final String appbuild = "v0.0";
	
	protected static String currentPlayer;
	
	public void onClick(ActionEvent event) {
		Button button = (Button) event.getSource();
		if (button.getText().equals("")) {
			button.setText(currentPlayer);
			// Vertical Win
			if ((button1.getText().equals(currentPlayer) && button2.getText().equals(currentPlayer) && button3.getText().equals(currentPlayer)) || (button4.getText().equals(currentPlayer) && button5.getText().equals(currentPlayer) && button6.getText().equals(currentPlayer)) || (button7.getText().equals(currentPlayer) && button8.getText().equals(currentPlayer) && button9.getText().equals(currentPlayer))) {
				alert = new Alert(AlertType.CONFIRMATION);
                alert.initStyle(StageStyle.DECORATED);
                alert.setTitle("Win");
                alert.setHeaderText(currentPlayer + " wins! Too bad for the losers...");
                alert.setContentText("...but you've got to suck it up, mate. Rematch?");
                if (alert.showAndWait().get().equals(ButtonType.OK)) {
                	button1.setText("");
    				button2.setText("");
    				button3.setText("");
    				button4.setText("");
    				button5.setText("");
    				button6.setText("");
    				button7.setText("");
    				button8.setText("");
    				button9.setText("");
    				currentPlayer = "X";
    				return;
                } else {
					Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
					stage.close();
				}
            // Horizontal win
			} else if ((button1.getText().equals(currentPlayer) && button4.getText().equals(currentPlayer) && button7.getText().equals(currentPlayer)) || (button2.getText().equals(currentPlayer) && button5.getText().equals(currentPlayer) && button8.getText().equals(currentPlayer)) || (button3.getText().equals(currentPlayer) && button6.getText().equals(currentPlayer) && button9.getText().equals(currentPlayer))) {
				alert = new Alert(AlertType.CONFIRMATION);
                alert.initStyle(StageStyle.DECORATED);
                alert.setTitle("Win");
                alert.setHeaderText(currentPlayer + " wins! Too bad for the losers...");
                alert.setContentText("...but you've got to suck it up, mate. Rematch?");
                if (alert.showAndWait().get().equals(ButtonType.OK)) {
                	button1.setText("");
    				button2.setText("");
    				button3.setText("");
    				button4.setText("");
    				button5.setText("");
    				button6.setText("");
    				button7.setText("");
    				button8.setText("");
    				button9.setText("");
    				currentPlayer = "X";
    				return;
                } else {
					Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
					stage.close();
				}
            // Diagonal win
			}  else if ((button1.getText().equals(currentPlayer) && button5.getText().equals(currentPlayer) && button9.getText().equals(currentPlayer)) || (button3.getText().equals(currentPlayer) && button5.getText().equals(currentPlayer) && button7.getText().equals(currentPlayer))) {
				alert = new Alert(AlertType.CONFIRMATION);
                alert.initStyle(StageStyle.DECORATED);
                alert.setTitle("Win");
                alert.setHeaderText(currentPlayer + " wins! Too bad for the losers...");
                alert.setContentText("...but you've got to suck it up, mate. Rematch?");
                if (alert.showAndWait().get().equals(ButtonType.OK)) {
                	button1.setText("");
    				button2.setText("");
    				button3.setText("");
    				button4.setText("");
    				button5.setText("");
    				button6.setText("");
    				button7.setText("");
    				button8.setText("");
    				button9.setText("");
    				currentPlayer = "X";
    				return;
                } else {
					Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
					stage.close();
				}
			} else if ((!button1.getText().equals("")) && (!button2.getText().equals("")) && (!button3.getText().equals("")) && (!button4.getText().equals("")) && (!button5.getText().equals("")) && (!button6.getText().equals("")) && (!button7.getText().equals("")) && (!button8.getText().equals("")) && (!button9.getText().equals(""))) {
				alert = new Alert(AlertType.CONFIRMATION);
                alert.initStyle(StageStyle.DECORATED);
                alert.setTitle("Draw");
                alert.setHeaderText("No one wins! It's a draw");
                alert.setContentText("What a good way to win a match, right? Maybe not? Rematch?");
                if (alert.showAndWait().get().equals(ButtonType.OK)) {
                	button1.setText("");
    				button2.setText("");
    				button3.setText("");
    				button4.setText("");
    				button5.setText("");
    				button6.setText("");
    				button7.setText("");
    				button8.setText("");
    				button9.setText("");
    				currentPlayer = "X";
    				return;
                } else {
					Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
					stage.close();
				}
			}
			
			// Change variable according to mode
			if (currentPlayer.equals("X")) {
				currentPlayer = "O";
			} else if (currentPlayer.equals("O")) {
				currentPlayer = "X";
			} else {
				alert = new Alert(AlertType.INFORMATION);
                alert.initStyle(StageStyle.DECORATED);
                alert.setTitle("Error");
                alert.setHeaderText("Error Code: -1");
                alert.setContentText("An error occured, see console for more details");
                if (alert.showAndWait().get().equals(ButtonType.OK)) {
                    System.out.println("Error Code -1, variable currentPlayer was not properly assigned.");
                    System.out.println("See GitHub source code if same error shows up.");
                }
				button1.setText("");
				button2.setText("");
				button3.setText("");
				button4.setText("");
				button5.setText("");
				button6.setText("");
				button7.setText("");
				button8.setText("");
				button9.setText("");
				currentPlayer = "X";
			}
		}
	}
}
