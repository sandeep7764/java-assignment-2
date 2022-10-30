package application;



import javafx.beans.*;
import javafx.collections.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.IOException;

public class AS24 extends Application {

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Registration Form");
		

	    //Label for name
        Label nameLabel=new Label("Name");
        //Text Field for Name
        TextField nameText=new TextField();


        //Label for gender
        Label genderLabel=new Label("gender");
        //Toggle group of radio button
        ToggleGroup groupGender=new ToggleGroup();
        RadioButton maleRadio=new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio=new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

       
        //Label for date of birth
        Label dobLabel=new Label("Date of birth");

        //date picker to choose date
        DatePicker datePicker=new DatePicker();

        //Label for Location
        Label stateLabel=new Label("Select Your State");

        //Choice box for location
        ChoiceBox stateChoiceBox=new ChoiceBox();
        stateChoiceBox.getItems().addAll(
        		 "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana"
        		 ,"Himachal Pradesh","Jammu and kashmir","Ladakh","Jharkhand","Karnataka","Kerala","Madhya Pradesh"
        		 ,"Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim"
        		 ,"Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"
        );

        //Label for technologies known
        Label qualificationLabel=new Label("Select Your Qualifiaction");

        //Check box for education
        CheckBox UGCheckBox=new CheckBox("UG");
        UGCheckBox.setIndeterminate(false);
        CheckBox PGCheckBox=new CheckBox("PG");
        PGCheckBox.setIndeterminate(false);
        CheckBox PhDCheckBox=new CheckBox("PhD");
        PhDCheckBox.setIndeterminate(false);

        
        //Label for register
        Button buttonRegister=new Button("Register");
        Label valLabel=new Label();
    	buttonRegister.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {			
				
				 if(nameText.getText().equals("")){ 
					 
					 valLabel.setText("unsuccessfull");
				 }
				 else {			
	                myStage.setTitle("Registartion Successfull");
	                
          
		                 
	                 FlowPane rootNode = new FlowPane(50, 50);
			
		             // Center the controls in the scene.
		             rootNode.setAlignment(Pos.CENTER);
		             Label status=new Label("Registration Status");           			
			 
		         	
		         		Separator separator = new Separator();
		         		separator.setPrefWidth(100);
		         		
		         		 Label msg=new Label("Employee registration is Successful!!!");
		         		 
		         		 
		         		Button btnVal=new Button("ok");
		            // Create a scene.
		           Scene myScene = new Scene(rootNode, 400, 300);
		           rootNode.getChildren().addAll(status,separator,msg,btnVal);
		           
		           
		   	       // Set the scene on the stage.
		           myStage.setScene(myScene);
			  }
			}
    	 });
        
        //Crating a Grid Pane
        GridPane gridPane=new GridPane();

        //Setting size for pane
        gridPane.setMinSize(500,300);

        //Setting the padding
        gridPane.setPadding(new Insets(10,10,10,10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel,0,0);
        gridPane.add(nameText,1,0);


        gridPane.add(genderLabel,0,2);
        gridPane.add(maleRadio,1,2);
        gridPane.add(femaleRadio,2,2);
        
        gridPane.add(dobLabel,0,1);
        gridPane.add(datePicker,1,1);

        gridPane.add(qualificationLabel,0,3);
        gridPane.add(UGCheckBox,1,3);
        gridPane.add(PGCheckBox,2,3);
        gridPane.add(PhDCheckBox,3,3);



        gridPane.add(stateLabel,0,5);
        gridPane.add(stateChoiceBox,1,5);

        gridPane.add(buttonRegister,2,7);
        gridPane.add(valLabel, 2, 8);
        
				
		
		// Create a scene.
		Scene myScene = new Scene(gridPane);


		// Set the scene on the stage.
		myStage.setScene(myScene);
		
		// Show the stage and its scene.
				myStage.show();
	}
	
}

				