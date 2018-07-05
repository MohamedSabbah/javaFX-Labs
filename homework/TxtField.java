/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Sab
 */
public class TxtField extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
          // Box Shape
        Box box = new Box(100,100, 100); 
        box.setTranslateX(100);
        box.setTranslateY(100);
        box.setTranslateZ(100);
         PhongMaterial pm = new PhongMaterial();
        pm.setDiffuseColor(Color.BLUE);
        box.setMaterial(pm);
        //-----------------------------------------------------------------------------------------------------------------------------------
        
        // Rotate Transition
       RotateTransition  trans = new RotateTransition();
         trans.setNode(box);
         trans.setDuration(Duration.seconds(1));
         trans.setByAngle(360);
         trans.setCycleCount(3);
         trans.setAutoReverse(true);
        //------------------------------------------------------------------------------------------------------------------------------
        // Text Field
        TextField txt = new TextField();
        txt.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               trans.play();
                
            }
        }
        );
    
        
       
        
        
        Group root = new Group(txt,box);
      //  root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Home Work!");
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
