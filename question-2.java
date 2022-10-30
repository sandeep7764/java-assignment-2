package application;

//Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;

public class AS22 extends Application {
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Menu control");
		
		// Use a BorderPane for the root node.
		BorderPane rootNode = new BorderPane();
		
		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 300);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
		
		// Create a label that will report the selection.
		response = new Label("Menu Demo");
		
		// Create the menu bar.
		MenuBar mb = new MenuBar();
		
		// Create the File menu.
		Menu fileMenu = new Menu("_File");  // now defines a mnemonic
		MenuItem New = new MenuItem("New");
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		fileMenu.getItems().addAll(New,open,save, new SeparatorMenuItem());
		
		// Turn on mnemonic
		fileMenu.setMnemonicParsing(true);
		
		// Add keyboard accelerators for the File menu.
		New.setAccelerator(KeyCombination.keyCombination("ctrl+N"));
		open.setAccelerator(KeyCombination.keyCombination("ctrl+O"));
		save.setAccelerator(KeyCombination.keyCombination("ctrl+S"));
		
		// Add File menu to the menu bar.
		mb.getMenus().add(fileMenu);
		
		// Create the Options menu.
		Menu editMenu = new Menu("Edit");
		
		// Create the Colors sub-menu.
		MenuItem cutMenu = new MenuItem("Cut");
		editMenu.getItems().add(cutMenu);


		// Create the Colors sub-menu.
		MenuItem copyMenu = new MenuItem("Copy");
		editMenu.getItems().add(copyMenu);
		
		// Create the Priority sub-menu.
		MenuItem pasteMenu = new MenuItem("Paste");
		editMenu.getItems().add(pasteMenu);
		
		// Add a separator.
	//	editMenu.getItems().add(new SeparatorMenuItem());
		

		// Add Options menu to the menu bar.
		mb.getMenus().add(editMenu);
		
		// Create the Help menu.
		Menu helpMenu = new Menu("Help");
		MenuItem aboutus = new MenuItem("AboutUs");
		helpMenu.getItems().add(aboutus);
		
		MenuItem  helpcenter= new MenuItem("Help Center");
		helpMenu.getItems().add(helpcenter);
		
		
		// Add Help menu to the menu bar.
		mb.getMenus().add(helpMenu);
		
		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				// If Exit is chosen, the program is terminated.
				if (name.equals("Exit"))
					Platform.exit();
				response.setText(name + " selected");
			}
		};
		
		// Set action event handlers for the menu items.
		New.setOnAction(MEHandler);
		open.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		cutMenu.setOnAction(MEHandler);
		copyMenu.setOnAction(MEHandler);
		pasteMenu.setOnAction(MEHandler);
		helpMenu.setOnAction(MEHandler);
		aboutus.setOnAction(MEHandler);
		
		// Add the menu bar to the top of the border pane and
		// the response label to the center position.
		rootNode.setTop(mb);
		rootNode.setCenter(response);
		
		// Show the stage and its scene.
		myStage.show();
	}
}

		