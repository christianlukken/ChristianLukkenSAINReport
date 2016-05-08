import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

public class AdminView extends Application  
{
	public void start(Stage primaryStage) throws Exception {
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.TOP_LEFT);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
			
			Button createStudentBtn= new Button("Create Student");
			grid.add(createStudentBtn, 0, 1);
			Button createProffessorBtn= new Button("Create new Proffessor");
			grid.add(createProffessorBtn, 0, 2);
			Button createMajorBtn = new Button("Create new major");
			grid.add(createMajorBtn, 0, 3);
			Button editMajorBtn = new Button("View or edit existing majors");
			grid.add(editMajorBtn, 0, 4);
			Button createCourseBtn = new Button("Create new course");
			grid.add(createCourseBtn, 0, 5);
			Button editCourseBtn = new Button("View or edit existing course");
			grid.add(editCourseBtn, 0, 6);
			Button createClassBtn= new Button("Create new class");
			grid.add(createClassBtn, 0, 7);
			Button editClassBtn=new Button("View or edit existing class");
			grid.add(editClassBtn, 0, 8);
		
			HBox hBox = new HBox(10);
			hBox.setAlignment(Pos.BOTTOM_RIGHT);
			hBox.getChildren().add(createStudentBtn);
			hBox.getChildren().add(createProffessorBtn);
			hBox.getChildren().add(createMajorBtn);
			hBox.getChildren().add(editMajorBtn);
			hBox.getChildren().add(createCourseBtn);
			hBox.getChildren().add(editCourseBtn);
			hBox.getChildren().add(createClassBtn);
			hBox.getChildren().add(editClassBtn);
			
			
			grid.add(hBox, 10, 10);
			
			Scene scene = new Scene(grid, 300, 275);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			createStudentBtn.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	GridPane studentGrid = new GridPane();
					studentGrid.setAlignment(Pos.TOP_LEFT);
					studentGrid.setHgap(10);
					studentGrid.setVgap(10);
					studentGrid.setPadding(new Insets(25, 25, 25, 25));
					HBox hBox = new HBox(10);
					hBox.setAlignment(Pos.BOTTOM_RIGHT);
					
					
					studentGrid.add(hBox, 10, 10);
					
			    	Scene createStudentScene=new Scene(grid, 300, 275);
			    	primaryStage.setScene(createStudentScene);
			    	primaryStage.show();
			        
			    }
			});
			
		}
		
	}

