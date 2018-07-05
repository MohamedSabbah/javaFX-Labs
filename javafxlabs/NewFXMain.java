/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.StrokeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Shadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Sab
 */
public class NewFXMain extends Application {

    private Effect sh;
    
    @Override
    public void start(Stage primaryStage) {
        Polygon poly = new Polygon(200,200,300,400,100,400);
        poly.setFill(Color.CHOCOLATE);
        poly.setStrokeWidth(10);
        
       
        /*
        RotateTransition  trans = new RotateTransition();
        trans.setNode(poly);
        trans.setDuration(Duration.seconds(2));
       trans.setByAngle(360);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);
        trans.play();
        */
      /*   ScaleTransition trans = new ScaleTransition();
        trans.setNode(poly);
        trans.setDuration(Duration.seconds(2));
      
       trans.setByX(1.5);
       trans.setByY(1.3);
       trans.setByZ(0.7);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);
        trans.play();
        */
      /*
        TranslateTransition  trans = new TranslateTransition();
        trans.setNode(poly);
        trans.setDuration(Duration.seconds(2));
        trans.setByX(300);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);
        trans.play;
                */
       /*
      FadeTransition  trans = new FadeTransition();
        trans.setNode(poly);
        trans.setDuration(Duration.seconds(2));
        trans.setFromValue(0.2);
        trans.setToValue(3);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);
        trans.play();
      */
      /*
       MoveTo moveto = new MoveTo(232, 52);
        LineTo line1 = new LineTo(269, 250);
        LineTo line2 = new LineTo(108, 71);
        LineTo line3 = new LineTo(321, 161);
        LineTo line4 = new LineTo(126, 232);
        LineTo line5 = new LineTo(232, 52);
        Path path = new Path(moveto, line1, line2, line3, line4, line5);
        path.setStroke(Color.CORAL);
        path.setStrokeWidth(3);
        path.setFill(Color.CHOCOLATE);
        
        */
      /*  StrokeTransition  trans = new StrokeTransition();
        trans.setShape(poly);
        trans.setDuration(Duration.seconds(2));
        trans.setFromValue(Color.AQUA);
        trans.setToValue(Color.BROWN);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);
        trans.play();
        */
      /* 
      MoveTo moveto = new MoveTo(232, 52);
        LineTo line1 = new LineTo(269, 250);
        LineTo line2 = new LineTo(108, 71);
        LineTo line3 = new LineTo(321, 161);
        LineTo line4 = new LineTo(126, 232);
        LineTo line5 = new LineTo(232, 52);
        Path path = new Path(moveto, line1, line2, line3, line4, line5);
        path.setStroke(Color.CORAL);
        path.setStrokeWidth(3);
        path.setFill(Color.CHOCOLATE);
        
        PathTransition  trans1 = new PathTransition();
        trans1.setPath(path);
        trans1.setNode(path);
        trans1.setDuration(Duration.seconds(5));
        trans1.setCycleCount(3);
        trans1.setAutoReverse(true);
        
        
        StrokeTransition  trans2 = new StrokeTransition();
        trans2.setShape(poly);
        trans2.setDuration(Duration.seconds(2));
        trans2.setFromValue(Color.AQUA);
        trans2.setToValue(Color.BROWN);
        trans2.setCycleCount(3);
        trans2.setAutoReverse(true);
       
        RotateTransition  trans3 = new RotateTransition();
        trans3.setNode(poly);
        trans3.setDuration(Duration.seconds(2));
       trans3.setByAngle(360);
        trans3.setCycleCount(3);
        trans3.setAutoReverse(true);
        
        
         ScaleTransition trans4 = new ScaleTransition();
        trans4.setNode(poly);
        trans4.setDuration(Duration.seconds(2));
       trans4.setByX(1.5);
       trans4.setByY(1.3);
       trans4.setByZ(0.7);
        trans4.setCycleCount(3);
        trans4.setAutoReverse(true);
        
        
        FadeTransition  trans5 = new FadeTransition();
        trans5.setNode(poly);
        trans5.setDuration(Duration.seconds(2));
        trans5.setFromValue(0.2);
        trans5.setToValue(3);
        trans5.setCycleCount(3);
        trans5.setAutoReverse(true);
        
        PauseTransition trans7 = new PauseTransition(Duration.seconds(1));
       
        SequentialTransition trans6 = new SequentialTransition(trans1,trans2,trans7,trans3,trans4,trans5);
        trans6.setNode(path);
        trans6.setNode(poly);
        trans6.play();
        */
      
        
    /*  Shadow sh =  new Shadow(BlurType.GAUSSIAN, Color.BROWN, 15);
        Text t = new Text(100, 100, " Wie geht's dir ?");
        t.setFont(Font.font("arial", 28));
        t.setFill(Color.BURLYWOOD);
        t.setEffect(sh);
       */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Button click= new Button("Click");
        TextField  txt = new TextField();
   // Button signup = new Button("Sign Up");
    
   /* 
    EventHandler<MouseEvent>handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello ,java");
            }
        }; */
      /*  login.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
              
                System.out.println("Mouse Clicked");
            }
        
    }); *//*
     EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello ,world");
            }
     };
                login.setOnMouseEntered (handler);
                
                signup.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.print("Mouse Exites");
            }
        
            });*/
  /*  click.setOnMouseClicked (new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                txt.setText("Hello,java");
                
            }
        
    });
      */
 /* EventHandler<MouseEvent> handler =( MouseEvent e ) -> System.out.print("Hello ,Javafx!");
  click.setOnMouseClicked(handler);
    */
 // click.setOnMouseClicked((MouseEvent e) -> txt.setText("Hello,Fx3!"));
 /*
    EventHandler<MouseEvent>handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello from bottun");
            }
        }; 
    
    EventHandler<MouseEvent>handler2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello ,from sence");
            }
        }; */
 
 
 //---------------------------------------------------------------------------------------------------------------------------------------------
 
 
            Media media = new Media(getClass().getResource("abc.mp3").toExternalForm());
            MediaPlayer player = new MediaPlayer(media);
            MediaView view = new MediaView(player);
            player.play();
            
            
            
        HBox g = new HBox(view);
     //   Group root = new Group(t);
        Scene scene = new Scene(g, 600, 750);
    //    click.addEventFilter(MouseEvent.MOUSE_CLICKED, handler);
       // scene.addEventFilter(MouseEvent.MOUSE_CLICKED, handler2);
        //g.addEventFilter(MouseEvent.MOUSE_CLICKED, handler2);
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
