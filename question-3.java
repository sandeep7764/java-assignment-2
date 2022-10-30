package application;
/*
public class AS23 {

}
*/
//package application;
/*
public class ContextMenuDemo {

}*/

//package application;

//Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Pos;

public class AS23 extends Application {
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Demonstrate Menus");
		
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
		
		// Create the New menu.
		Menu NewMenu = new Menu("New");
		
		//create the view submenu
		MenuItem file = new MenuItem("File");
		MenuItem folder = new MenuItem("Folder");
		MenuItem image = new MenuItem("image");
		NewMenu.getItems().addAll(file,folder,image, new SeparatorMenuItem());
		
		
		// Add New menu to the menu bar.
		mb.getMenus().add(NewMenu);
		
		// Create the view  menu.
		Menu viewMenu = new Menu("View");
		
		// Create the view sub-menu.
		MenuItem large = new MenuItem("Large");
		MenuItem medium = new MenuItem("Medium");
		MenuItem small = new MenuItem("Small");
		
		viewMenu.getItems().addAll(large,medium,small,new SeparatorMenuItem());
	
		
		// Add a separator.
	    // viewMenu.getItems().add(new SeparatorMenuItem());
		
		// Add view menu to the menu bar.
		mb.getMenus().add(viewMenu);		
		
		// Create the context menu items
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		
		// Create a context (i.e., popup) menu that shows edit options.
		final ContextMenu editMenu = new ContextMenu(cut, copy, paste);
		
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
		file.setOnAction(MEHandler);
		folder.setOnAction(MEHandler);
		image.setOnAction(MEHandler);
		large.setOnAction(MEHandler);
		medium.setOnAction(MEHandler);
		small.setOnAction(MEHandler);	
		cut.setOnAction(MEHandler);
		copy.setOnAction(MEHandler);
		paste.setOnAction(MEHandler);
		
		// Create a text field and set its column width to 20.
		TextField tf = new TextField();
		tf.setPrefColumnCount(20);
		
		// Add the context menu to the textfield.
		tf.setContextMenu(editMenu);
		
		// Add the menu bar to the top of the border pane and
		// the response label to the center position.
		rootNode.setTop(mb);
		
		// Create a flow pane that will hold both the response
		// label and the text field.
		FlowPane fpRoot = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		fpRoot.setAlignment(Pos.CENTER);
		
		// Add both the label and the text field to the flow pane.
		fpRoot.getChildren().addAll(response, tf);
		
		// Add the flow pane to the center of the border layout.
		rootNode.setCenter(fpRoot);
		
		// Show the stage and its scene.
		myStage.show();
	}
}

