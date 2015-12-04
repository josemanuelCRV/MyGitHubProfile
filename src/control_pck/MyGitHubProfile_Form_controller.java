package control_pck;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MyGitHubProfile_Form_controller {

	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		AnchorPane root = new AnchorPane();
		Scene primaryScene = new Scene(root, 500, 400);

		initializePrimaryStage(primaryStage, primaryScene);
		primaryStage.show();
	}

	private void initializePrimaryStage(Stage primaryStage, Scene primaryScene) {
		// TODO Auto-generated method stub
		primaryStage.setTitle("MyGitHub Form");
		primaryStage.setScene(primaryScene);
		primaryStage.setWidth(500);
		primaryStage.setHeight(400);
		primaryStage.setResizable(false);

	}

}
