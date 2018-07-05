/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

/**
 *
 * @author Sab
 */
public class LoginForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         
         Label l = new Label("Username");
         l.setLayoutX(55);
         l.setLayoutY(50);
          Label l2 = new Label("Password");
         l2.setLayoutX(55);
         l2.setLayoutY(70);
         
        ToggleButton tb = new ToggleButton("hi");
        Group root = new Group(l,l2,tb);
       // root.getChildren().add();
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
