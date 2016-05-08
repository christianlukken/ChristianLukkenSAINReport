

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LogInView extends Application

{
	
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		
		Button studentBtn= new Button("Students");
		grid.add(studentBtn, 0, 1);
		Button proffessorBtn= new Button("Proffessors");
		grid.add(proffessorBtn, 0, 2);
		Button majorBtn = new Button("Majors");
		grid.add(majorBtn, 0, 3);
		Button courseBtn = new Button("Courses");
		grid.add(courseBtn, 0, 4);
		Button classBtn = new Button("Classes");
		grid.add(classBtn, 0, 5);
	
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.BOTTOM_RIGHT);
		
		
		
		grid.add(hBox, 10, 10);
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		studentBtn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) 
		    {
		    	GridPane grid2 = new GridPane();
				grid2.setAlignment(Pos.CENTER);
				grid2.setHgap(10);
				grid2.setVgap(10);
				grid2.setPadding(new Insets(25, 25, 25, 25));
				
				
				Button createStudentBtn= new Button("Create New Student");
				grid2.add(createStudentBtn, 0, 1);
				Button studentListBtn= new Button("View Student list");
				grid2.add(studentListBtn, 0, 2);
				Button searchStudentBtn= new Button("Search Student");
				grid2.add(searchStudentBtn, 0, 3);
				 
				Scene scene2 = new Scene(grid2, 300, 275);
				primaryStage.setScene(scene2);
				primaryStage.show();
				
				Button backBtn=new Button("Back");
				grid2.add(backBtn, 0, 4);
				backBtn.setOnAction(new EventHandler<ActionEvent>() {
		    	    @Override public void handle(ActionEvent e) {
		    	    	primaryStage.setScene(scene);
		    	    }
		    	});
				
				createStudentBtn.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) 
				    {
				    	GridPane grid3 = new GridPane();
				    	grid3.setAlignment(Pos.TOP_LEFT);
				    	grid3.setHgap(10);
				    	grid3.setVgap(10);
				    	grid3.setPadding(new Insets(25, 25, 25, 25));
				    	
				    	Label name= new Label ("name");
				    	grid3.add(name, 0, 1);
				    	
				    	TextField nameTextField = new TextField();
				    	grid3.add(nameTextField, 1, 1);
				    	
				    	Label username= new Label ("Username");
				    	grid3.add(username, 0, 2);
				    	
				    	TextField usernameTextField = new TextField();
				    	grid3.add(usernameTextField, 1, 2);
				    	
				    	Label password= new Label ("Password");
				    	grid3.add(password, 0, 3);
				    	
				    	TextField passwordTextField = new TextField();
				    	grid3.add(passwordTextField, 1, 3);
				    	
				    	Label Major= new Label ("Major");
				    	grid3.add(Major, 0, 4);
				    	
				    	TextField gpaTextField = new TextField();
				    	grid3.add(gpaTextField, 1, 4);
				    	
				    	Label streetAddress= new Label ("Street Address");
				    	grid3.add(streetAddress, 4, 1);
				    	
				    	TextField streetAddressTextField = new TextField();
				    	grid3.add(streetAddressTextField, 5, 1);
				    	
				    	Label city= new Label ("city");
				    	grid3.add(city, 4, 2);
				    	
				    	TextField cityTextField = new TextField();
				    	grid3.add(cityTextField, 5, 2);
				    	
				    	Label state= new Label ("State");
				    	grid3.add(state, 4, 3);
				    	
				    	TextField stateTextField = new TextField();
				    	grid3.add(stateTextField, 5, 3);
				    	
				    	
				    	
				    	
				    	
				    	
				    	Button saveBtn= new Button("Save");
				    	grid3.add(saveBtn, 2, 5);
				    	
				    	Button backBtn=new Button("Back");
				    	grid3.add(backBtn, 3, 5);
				    	
				    	Scene createStudentScene = new Scene(grid3, 300, 275);
				    	primaryStage.setScene(createStudentScene);
				    	backBtn.setOnAction(new EventHandler<ActionEvent>() {
				    	    @Override public void handle(ActionEvent e) {
				    	    	primaryStage.setScene(scene2);
				    	    }
				    	});

						 
						
						    	
				    	
				        
				    }
				});
				    	
		    	
		        
		    }
		});
		proffessorBtn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) 
		    {
		    	GridPane grid2 = new GridPane();
				grid2.setAlignment(Pos.CENTER);
				grid2.setHgap(10);
				grid2.setVgap(10);
				grid2.setPadding(new Insets(25, 25, 25, 25));
				
				
				Button createproffessortBtn= new Button("Create new Proffessor");
				grid2.add(createproffessortBtn, 0, 1);
				Button proffessorListBtn= new Button("View Proffessor List");
				grid2.add(proffessorListBtn, 0, 2);
				Button searchProffessorBtn= new Button("Search Proffessor");
				grid2.add(searchProffessorBtn, 0, 3);
				 
				Scene scene2 = new Scene(grid2, 300, 275);
				primaryStage.setScene(scene2);
				primaryStage.show();
				Button backBtn=new Button("Back");
				grid2.add(backBtn, 0, 4);
				backBtn.setOnAction(new EventHandler<ActionEvent>() {
		    	    @Override public void handle(ActionEvent e) {
		    	    	primaryStage.setScene(scene);
		    	    }
		    	});
				createproffessortBtn.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) 
				    {
				    	
				    	GridPane grid3 = new GridPane();
				    	grid3.setAlignment(Pos.TOP_LEFT);
				    	grid3.setHgap(10);
				    	grid3.setVgap(10);
				    	grid3.setPadding(new Insets(25, 25, 25, 25));

				    	Label name= new Label ("name");
				    	grid3.add(name, 0, 1);

				    	TextField nameTextField = new TextField();
				    	grid3.add(nameTextField, 1, 1);

				    	Label username= new Label ("Username");
				    	grid3.add(username, 0, 2);

				    	TextField usernameTextField = new TextField();
				    	grid3.add(usernameTextField, 1, 2);

				    	Label password= new Label ("Password");
				    	grid3.add(password, 0, 3);

				    	TextField passwordTextField = new TextField();
				    	grid3.add(passwordTextField, 1, 3);

				    	Label streetAddress= new Label ("Street Address");
				    	grid3.add(streetAddress, 4, 1);

				    	TextField streetAddressTextField = new TextField();
				    	grid3.add(streetAddressTextField, 5, 1);

				    	Label city= new Label ("City");
				    	grid3.add(city, 4, 2);

				    	TextField cityTextField = new TextField();
				    	grid3.add(cityTextField, 5, 2);

				    	Label state= new Label ("State");
				    	grid3.add(state, 4, 3);

				    	TextField stateTextField = new TextField();
				    	grid3.add(stateTextField, 5, 3);

				    	Label phoneNumber= new Label ("Phone Number");
				    	grid3.add(phoneNumber, 0, 4);

				    	TextField phoneNumberTextField = new TextField();
				    	grid3.add(phoneNumberTextField, 1, 4);

				    	Label officeHours= new Label ("Office Hours");
				    	grid3.add(officeHours, 0, 5);

				    	TextField officeHoursTextField = new TextField();
				    	grid3.add(officeHoursTextField, 1, 5);



				    	Button saveBtn= new Button("Save");
				    	grid3.add(saveBtn, 2, 5);

				    	Button backBtn=new Button("Back");
				    	grid3.add(backBtn, 3, 5);


				    	backBtn.setOnAction(new EventHandler<ActionEvent>() {
				    	    @Override public void handle(ActionEvent e) {
				    	    	primaryStage.setScene(scene2);
				    	    }
				    	});

				    	Scene createProffessorScene = new Scene(grid3, 300, 275);
				    	primaryStage.setScene(createProffessorScene);


				    	
				    	
				    	
				    	
				        
				    }
				});
		    	
		    	
		    	
		    	
		        
		    }
		});
		majorBtn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) 
		    {
		    	GridPane grid2 = new GridPane();
				grid2.setAlignment(Pos.CENTER);
				grid2.setHgap(10);
				grid2.setVgap(10);
				grid2.setPadding(new Insets(25, 25, 25, 25));
				
				
				Button createMajorBtn= new Button("Create new Major");
				grid2.add(createMajorBtn, 0, 1);
				Button majorListBtn= new Button("Major List");
				grid2.add(majorListBtn, 0, 2);
				Button searchMajorBtn= new Button("Search Major");
				grid2.add(searchMajorBtn, 0, 3);
				 
				Scene scene2 = new Scene(grid2, 300, 275);
				primaryStage.setScene(scene2);
				primaryStage.show();
				Button backBtn=new Button("Back");
				grid2.add(backBtn, 0, 4);
				backBtn.setOnAction(new EventHandler<ActionEvent>() {
		    	    @Override public void handle(ActionEvent e) {
		    	    	primaryStage.setScene(scene);
		    	    }
		    	});
				
				createMajorBtn.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) 
				    {
				    	GridPane grid3 = new GridPane();
				    	grid3.setAlignment(Pos.TOP_LEFT);
				    	grid3.setHgap(10);
				    	grid3.setVgap(10);
				    	grid3.setPadding(new Insets(25, 25, 25, 25));

				    	Label title= new Label ("Major Title");
				    	grid3.add(title, 0, 1);

				    	TextField titleTextField = new TextField();
				    	grid3.add(titleTextField, 1, 1);

				    	Label ID= new Label ("Major ID");
				    	grid3.add(ID, 0, 1);

				    	TextField IDTextField = new TextField();
				    	grid3.add(IDTextField, 1, 1);

				    	Label credits= new Label ("Major Credits");
				    	grid3.add(credits, 0, 1);

				    	TextField creditsTextField = new TextField();
				    	grid3.add(creditsTextField, 1, 1);






				    	Button saveBtn= new Button("Save");
				    	grid3.add(saveBtn, 2, 5);

				    	Button backBtn=new Button("Back");
				    	grid3.add(backBtn, 3, 5);


				    	backBtn.setOnAction(new EventHandler<ActionEvent>() {
				    	    @Override public void handle(ActionEvent e) {
				    	    	primaryStage.setScene(scene);
				    	    }
				    	});

				    	Scene createProffessorScene = new Scene(grid3, 300, 275);
				    	primaryStage.setScene(createProffessorScene);
						
				    	
				    	
				        
				    }
				});
		    	
		        
		    }
		});
		courseBtn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) 
		    {
		    	GridPane grid2 = new GridPane();
				grid2.setAlignment(Pos.CENTER);
				grid2.setHgap(10);
				grid2.setVgap(10);
				grid2.setPadding(new Insets(25, 25, 25, 25));
		    	Button createMajortBtn= new Button("Create new Major");
				grid2.add(createMajortBtn, 0, 1);
				Button majorListBtn= new Button("Major List");
				grid2.add(majorListBtn, 0, 2);
				Button searchMajorBtn= new Button("Search Major");
				grid2.add(searchMajorBtn, 0, 3);
				 
				Scene scene2 = new Scene(grid2, 300, 275);
				primaryStage.setScene(scene2);
				primaryStage.show();
				Button backBtn=new Button("Back");
				grid2.add(backBtn, 0, 4);
				backBtn.setOnAction(new EventHandler<ActionEvent>() {
		    	    @Override public void handle(ActionEvent e) {
		    	    	primaryStage.setScene(scene);
		    	    }
		    	});
				courseBtn.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) 
				    {
				    	GridPane grid3 = new GridPane();
				    	grid3.setAlignment(Pos.TOP_LEFT);
				    	grid3.setHgap(10);
				    	grid3.setVgap(10);
				    	grid3.setPadding(new Insets(25, 25, 25, 25));

				    	Label title= new Label ("Course Title");
				    	grid3.add(title, 0, 1);

				    	TextField titleTextField = new TextField();
				    	grid3.add(titleTextField, 1, 1);

				    	Label ID= new Label ("Course ID");
				    	grid3.add(ID, 0, 2);

				    	TextField IDTextField = new TextField();
				    	grid3.add(IDTextField, 1, 2);

				    	Label credits= new Label ("Course Credits");
				    	grid3.add(credits, 0, 3);

				    	TextField creditsTextField = new TextField();
				    	grid3.add(creditsTextField, 1, 3);

				    	Label major= new Label ("Course Major");
				    	grid3.add(major, 0, 4);

				    	TextField majorTextField = new TextField();
				    	grid3.add(majorTextField, 1, 4);

				    	Label description= new Label ("Course Description");
				    	grid3.add(description, 0, 5);

				    	TextField descriptionTextField = new TextField();
				    	grid3.add(descriptionTextField, 1, 5);

				    	Button saveBtn= new Button("Save");
				    	grid3.add(saveBtn, 2, 5);

				    	Button backBtn=new Button("Back");
				    	grid3.add(backBtn, 3, 5);


				    	backBtn.setOnAction(new EventHandler<ActionEvent>() {
				    	    @Override public void handle(ActionEvent e) {
				    	    	primaryStage.setScene(scene2);
				    	    }
				    	});

				    	Scene createProffessorScene = new Scene(grid3, 300, 275);
				    	primaryStage.setScene(createProffessorScene);


						
				        
				    }
				});
		        
		    }
		});
		
		classBtn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) 
		    {
		    	GridPane grid2 = new GridPane();
				grid2.setAlignment(Pos.CENTER);
				grid2.setHgap(10);
				grid2.setVgap(10);
				grid2.setPadding(new Insets(25, 25, 25, 25));
		    	Button createClassBtn= new Button("Create new Class");
				grid2.add(createClassBtn, 0, 1);
				Button classListBtn= new Button("Class List");
				grid2.add(classListBtn, 0, 2);
				Button searchClassBtn= new Button("Search Class");
				grid2.add(searchClassBtn, 0, 3);
				 
				Scene scene2 = new Scene(grid2, 300, 275);
				primaryStage.setScene(scene2);
				primaryStage.show();
				Button backBtn=new Button("Back");
				grid2.add(backBtn, 0, 4);
				backBtn.setOnAction(new EventHandler<ActionEvent>() {
		    	    @Override public void handle(ActionEvent e) {
		    	    	primaryStage.setScene(scene);
		    	    }
		    	});
		    	createClassBtn.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) 
				    {
				    	GridPane grid3 = new GridPane();
				    	grid3.setAlignment(Pos.TOP_LEFT);
				    	grid3.setHgap(10);
				    	grid3.setVgap(10);
				    	grid3.setPadding(new Insets(25, 25, 25, 25));

				    	Label courseName= new Label ("Course Name");
				    	grid3.add(courseName, 0, 1);

				    	TextField courseNameTextField = new TextField();
				    	grid3.add(courseNameTextField, 1, 1);

				    	Label description= new Label ("Proffessor Name");
				    	grid3.add(description, 0, 2);

				    	TextField descriptionTextField = new TextField();
				    	grid3.add(descriptionTextField, 1, 2);

				    	Label startEndTime = new Label ("Class start and end time");
				    	grid3.add(startEndTime, 0, 3);

				    	TextField startEndTimeTextField = new TextField();
				    	grid3.add(startEndTimeTextField, 1, 3);

				    	Label startEndDate= new Label ("Class start and end date");
				    	grid3.add(startEndDate, 0, 4);

				    	TextField creditsTextField = new TextField();
				    	grid3.add(creditsTextField, 1, 4);

				    	Label meetingPlace= new Label ("Location");
				    	grid3.add(meetingPlace, 0, 5);

				    	TextField LocationTextField = new TextField();
				    	grid3.add(LocationTextField, 1, 5);

				    	Button saveBtn= new Button("Save");
				    	grid3.add(saveBtn, 2, 5);

				    	Button backBtn=new Button("Back");
				    	grid3.add(backBtn, 3, 5);


				    	backBtn.setOnAction(new EventHandler<ActionEvent>() {
				    	    @Override public void handle(ActionEvent e) {
				    	    	primaryStage.setScene(scene);
				    	    }
				    	});

				    	Scene createProffessorScene = new Scene(grid3, 300, 275);
				    	primaryStage.setScene(createProffessorScene);

				        
				    }
				});
				
		    }
		});
		
		
		
		/*String admin="admin";
		String adminPass="password";
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Label error= new Label("Invaild Username or Password");
		
		
		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label passWord = new Label("Password:");
		grid.add(passWord, 0, 2);

		PasswordField passWordField = new PasswordField();
		grid.add(passWordField, 1, 2);
		
		
		Button logInButton = new Button("Sign in");
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.BOTTOM_RIGHT);
		hBox.getChildren().add(logInButton);
		grid.add(hBox, 1, 4);
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
		logInButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        if(userTextField.getText().equals(admin) && passWordField.getText().equals(adminPass))
		        {
		        	
		        	
		        }
		        else
		        {
		        	error.setTextFill(Color.RED);
		        	grid.add(error, 1, 3);
		        }
		    }
		});
		*/
	}
	
}
