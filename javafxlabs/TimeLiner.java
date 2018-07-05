/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Timeline;
/**
 *
 * @author Sab
 */
public class TimeLiner extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Rectangle rect = new Rectangle(0, 0, 100, 50);
        
        //keyValue
        KeyValue xKey = new KeyValue(rect.xProperty(), 100);
         KeyValue yKey = new KeyValue(rect.yProperty(), 100);
          KeyValue opkey = new KeyValue(rect.opacityProperty(), 0);
      
          // keyframe 
         KeyFrame keyframe = new KeyFrame(Duration.seconds(5), xKey,yKey,opkey);
            KeyFrame keyframe1 = new KeyFrame(Duration.seconds(5), xKey,yKey);
              KeyFrame keyframe2 = new KeyFrame(Duration.seconds(10), opkey);
          
          //timeLine 
          
          Timeline timeline = new Timeline(keyframe);
          timeline.setAutoReverse(true);
          timeline.setCycleCount(50);
          timeline.play();
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
  
                  
        
        Group root = new Group(rect);
   
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
