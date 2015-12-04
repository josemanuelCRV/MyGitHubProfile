package application;

import java.io.File;
import java.io.IOException;

import control_pck.MyGitHubProfile_Form_controller;
import control_pck.MyGitHubProfile_controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * Main class take the control of main View
 *
 * @author JoseManuel
 * @version 1.0.0
 *
 */

public class Main extends Application {

	private Stage primaryStage;
	private AnchorPane MyGitHubProfile_view;

	public Main() {
		// TODO Auto-generated constructor stub
		// Constructor vacio
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("MyGitHub Profile");
			primaryStage.show();
			initMyGitHubProfile_view();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initMyGitHubProfile_view() {
		// TODO Auto-generated method stub
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../vista_pck/MyGitHubProfile_view.fxml"));
			MyGitHubProfile_view = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(MyGitHubProfile_view);
			primaryStage.setScene(scene);

			// Give the controller access to the main.
			MyGitHubProfile_controller controller = loader.getController();
			controller.setMain(this);

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Connection method with the Graphics class ViewController Load the new
	 * dialog to show GraphicalView on primaryStage
	 *
	 */
	public void showMyGitHubProfile_view() {

		MyGitHubProfile_Form_controller gphControler = new MyGitHubProfile_Form_controller();
		gphControler.start(primaryStage);

		// try {
		// // Load the fxml file and create a new stage for the popup.
		// FXMLLoader loader = new FXMLLoader();
		// loader.setLocation(MainApp.class.getResource("../view/GraphicalView.fxml"));
		// AnchorPane page = (AnchorPane) loader.load();
		// Stage dialogStage = new Stage();
		// dialogStage.setTitle("Graphical View");
		// dialogStage.initModality(Modality.WINDOW_MODAL);
		// dialogStage.initOwner(primaryStage);
		// Scene scene = new Scene(page);
		// dialogStage.setScene(scene);
		// dialogStage.show();
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	/**
	 * Method getPrimaryStage
	 *
	 * @return the primaryStage
	 */
	public Stage getPrimaryStage() {
		return primaryStage;

	}

	public static void main(String[] args) {
		launch(args);
	}
}
