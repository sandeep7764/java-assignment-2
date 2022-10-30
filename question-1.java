package application;



//Demonstrate a text field.
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

class InvalidException extends Exception { 
   	
}

public class AS21 extends Application {
	TextField tf,tff;
	Label response;
	Label response1;
    

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Read Uname and pasword");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane rootNode = new FlowPane(50, 50);
		
		// Center the controls in the scene.
		rootNode.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene myScene = new Scene(rootNode, 400, 600);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
		
		// Create a label that will report the contents of the
		// text field.
		response = new Label("Verify Name: ");
		//response1= new Label("Verify password: ");
		
		// Create a button that gets the text.
		Button btnGetUserName = new Button("Login If Valid");

		Separator separator = new Separator();
		separator.setPrefWidth(180);
		
		
		response1= new Label("Verify password: ");
//		Button btnGetUserName = new Button("Get Password");

		Separator separator1 = new Separator();
		separator1.setPrefWidth(180);
				
		
		// Create a text field.
		tf = new TextField();
		tff= new TextField();
		
		// Set the prompt.
		tf.setPromptText("Enter UserName");
		tff.setPromptText("Enter password");
		
		// Set preferred column count.
		tf.setPrefColumnCount(30);
		tff.setPrefColumnCount(30);
		
		// Handle action events for the text field. Action
		// events are generated when ENTER is pressed while
		// the text field has input focus. In this case, the
		// text in the field is obtained and displayed.
		tf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				  response.setText("UserName: " + tf.getText());
			}
		});
		

	//	Separator separator = new Separator();
	//	separator.setPrefWidth(180);
		
		
		tff.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
			
				   response1.setText("Password: " + tff.getText());
			}
		});
		

		//Separator separator1 = new Separator();
		//separator1.setPrefWidth(180);
		
	
		// Get text from the text field when the button is pressed
		// and display it.
		btnGetUserName.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try {
				  if(tf.getText().equals(null) || tff.getText().equals(null)) {
					  response.setText("empty");
					 
									  
				  }
				
				  else if(tf.getText().equals("Basavaraj") &&  tff.getText().equals("777"))
				  {
				    	  
				    response.setText("User Name: " + tf.getText());
				    response1.setText("password: " + tff.getText());
				    
				    myStage.setTitle("LOGIN SCREEN");
				  
                      
					  
				    FlowPane rootNode = new FlowPane(50, 50);
						
					// Center the controls in the scene.
					rootNode.setAlignment(Pos.CENTER);
					Label wc=new Label("Welcome");	
						
					// Create a scene.
					Scene myScene = new Scene(rootNode, 400, 600);	
	                
					// Set the scene on the stage.
					myStage.setScene(myScene);
					
					 rootNode.getChildren().addAll(wc);
				  }
				  else 
				  {
					  response.setText("U entered a invalid name");
					  response1.setText("U entered inavalid password");
					  throw new InvalidException();
			      }
			   } catch(InvalidException i) {
			   }
			  
			}   
		  });
		
	//	Separator separator = new Separator();
		separator.setPrefWidth(180);
		/*
		btnGet.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				 
			}
		});*/
		// Use a separator to better organize the layout.

		
//		Separator separator1 = new Separator();
		separator1.setPrefWidth(180);
		
		
		// Add controls to the scene graph.
		rootNode.getChildren().addAll(tf,tff, btnGetUserName, separator,separator1, response,response1);
		
		// Show the stage and its scene.
		myStage.show();
	}
}
