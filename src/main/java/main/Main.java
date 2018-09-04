package main;

import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/GUI.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sorting Program");
		primaryStage.show();
		
	}

	public static void main (String[] args) {
		launch(args);
		
//		Calculator cal = new Calculator();
////		cal.addRational(2,3,3,2);
//		
//		System.out.println(cal.getNumerator());
//		System.out.println(cal.getDenominator());
//		
		
		
		
		
	}
	
}
