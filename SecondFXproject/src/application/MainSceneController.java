/******************************************************************************************** 
 * COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD The reproduction,
 * transmission or use of this document/file or its contents is not permitted
 * without written authorization. Offenders will be liable for damages. All
 * rights reserved.
 * ---------------------------------------------------------------------------
 * Purpose:  MainSceneController.java 
 * Project:  Controller class of JavaFX application.
 * Platform: Cross-platform(Windows, macOS, Linux) 
 * Compiler: JDK-22 
 * IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components) 
 *           Version:  2024-03 (4.31.0)
 *           Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

/**
 * 
 * Controller class for handling the MainScene.fxml file.
 */
public class MainSceneController {

	@FXML
	private TextField tfTITLE; // TextField object for the title input

	/**
	 * 
	 * Event handler for the OK button click event. Updates the title of the main
	 * window with the text entered in the TextField.
	 * 
	 * @param event The ActionEvent triggered by clicking the OK button.
	 */
	@FXML
	public void btnOKClicked(ActionEvent event) {
		Stage mainWindow = (Stage) tfTITLE.getScene().getWindow(); // Get the main window
		String title = tfTITLE.getText(); // Get the text from the TextField
		mainWindow.setTitle(title); // Set the title of the main window
	}
}
