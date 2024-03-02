package tictactoe;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;


public class Setup extends Application {
	private Alert alert;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					switch (event.getCode()) {
						case V: {
							alert = new Alert(AlertType.INFORMATION);
			                alert.initStyle(StageStyle.DECORATED);
			                alert.setTitle("Version");
			                alert.setHeaderText("Version No: " + GameController.appbuild);
			                alert.setContentText("Initial release, normal tictactoe");
			                if (alert.showAndWait().get().equals(ButtonType.OK)) {
			                    System.out.println("Game Version No: " + GameController.appbuild);
			                }
			                break;
						}
						case R: {
							alert = new Alert(AlertType.INFORMATION);
			                alert.initStyle(StageStyle.DECORATED);
			                alert.setTitle("Credits");
			                alert.setHeaderText("JDK21, JFX-SDK21");
			                alert.setContentText("Oracle build of JDK21, JavaFX SDK 21, Cross-platform JAR");
			                if (alert.showAndWait().get().equals(ButtonType.OK)) {
			                    System.out.println("Cross-platform: " + true);
			                }
			                break;
						}
						case C: {
							alert = new Alert(AlertType.INFORMATION);
			                alert.initStyle(StageStyle.DECORATED);
			                alert.setTitle("Copyright");
			                alert.setHeaderText("No copyright");
			                alert.setContentText("GPL-something, I forgot");
			                if (alert.showAndWait().get().equals(ButtonType.OK)) {
			                    System.out.println("Cross-platform: " + true);
			                }
			                break;
						}
						case SHIFT: {
							String jokeString;
							switch ((int) (Math.random() * 31)) {
	                        case 1:
	                        jokeString = ("Do you REALLY need help?");
	                        break;
	                    
	                        case 2:
	                        jokeString = ("Can you use your common sense?");
	                        break;
	                        
	                        case 3:
	                        jokeString = ("I\'m gonna quit this game...");
	                        break;
	                            
	                        case 4:
	                        jokeString = ("Alright, this is just an insult...");
	                        break;
	                        
	                        case 5:
	                        jokeString = ("Lemme go play CS:GO instead...");
	                        break;
	                        
	                        case 6:
	                        jokeString = ("Roblox is still alive?");
	                        break;
	                        
	                        case 7:
	                        jokeString = ("Can you bring something from Jeff\'s?");
	                        break;
	                        
	                        case 8:
	                        jokeString = ("Who am I kidding...");
	                        break;
	                        
	                        case 9:
	                        jokeString = ("Can\'t you leave a game alone?");
	                        break;

	                        case 10:
	                        jokeString = ("Charlie Brown, come stop this guy!");
	                        break;

	                        case 11:
	                        jokeString = ("Fortnite seems to be trending.");
	                        break;

	                        case 12:
	                        jokeString = ("FYI, my fav game is Geometry Dash.");
	                        break;

	                        case 13:
	                        jokeString = ("My fav dev is GDColon, is he dev tho?");
	                        break;

	                        case 14:
	                        jokeString = ("YOU WILL CRASH THIS GAME!!!");
	                        break;
	                        
	                        case 15:
	                        jokeString = ("I can\'t stand this, HELP!!");
	                        break;
	                        
	                        case 16:
	                        jokeString = ("Rats, Steam is dead RIP...");
	                        break;
	                        
	                        case 17:
	                        jokeString = ("Itch.io is idle RIP...");
	                        break;

	                        case 18:
	                        jokeString = ("Game Jolt doesn\'t have good players...");
	                        break;
	                        
	                        case 19:
	                        jokeString = ("When is the next GDColon video?");
	                        break;
	                        
	                        case 20:
	                        jokeString = ("Why don\'t you help me code instead? Just go to my GitHub...");
	                        break;  

	                        case 21:
	                        jokeString = ("New updates are always good, right?");
	                        break;
	                        
	                        case 22:
	                        jokeString = ("CS2 is trash, I\'d rather play Fortnite...");
	                        break;
	                        
	                        case 23:
	                        jokeString = ("Gimme some robux in pls donate...");
	                        break;
	                        
	                        case 24:
	                        jokeString = ("Win11 is mid, Ubuntu better!");
	                        break;
	                        
	                        case 25:
	                        jokeString = ("My fav Roblox game is DOORS. It was when Win10 was ...");
	                        break;
	                            
	                        case 26:
	                        jokeString = ("I am skilled in Java, mid in C#, noob in Lua");
	                        break;
	                        
	                        case 27:
	                        jokeString = ("IDK why I love Java...");
	                        break;
	                        
	                        case 28:
	                        jokeString = ("Lua is also quite good, man...");
	                        break;

	                        case 29:
	                        jokeString = ("C# is OP, tho!");
	                        break;
	                        
	                        case 30:
	                        jokeString = ("Don't you have something else to do?");
	                        break;

	                        default:
	                        jokeString = ("IDONTHAVEANYTHINGTOSAYMATE");
	                        break;
	                    }
							alert = new Alert(AlertType.INFORMATION);
			                alert.initStyle(StageStyle.DECORATED);
			                alert.setTitle("newTitle");
			                alert.setHeaderText("newHeaderTitle");
			                alert.setContentText(jokeString);
			                if (alert.showAndWait().get().equals(ButtonType.OK)) {
			                    System.out.println("Cross-platform: " + true);
			                }
			                break;
						}
						default:
							System.out.println("Try V, R, C, and SHIFT keys.");
					}
				}
			});
			
			primaryStage.setTitle("Tic Tac Toe!");
			GameController.currentPlayer = "X";
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
