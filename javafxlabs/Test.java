/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Sab
 */
public class Test extends Application{

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException  {
       
       // Polygon poly = new Polygon(100,100,200,200,50,200);
        // poly.setFill(Color.web("#2f8fff"));
       /* 
        Text text = new Text(100, 100, "Guten Morgen");
        text.setFont(Font.font("arial", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 25));
        text.setFill(Color.RED);
        text.setRotate(20);
        text.setStrikethrough(true);
        text.setUnderline(true);
        List<String> l = Font.getFamilies();
        System.out.println(l);
        */
        Image img = new Image(new FileInputStream("Images\\IMG_20141019_140340.jpg"));
        ImageView view = new ImageView(img);
         ImageView view2 = new ImageView(img);
          ImageView view3 = new ImageView(img);
        view.setFitHeight(20);
        view.setFitWidth(20);
        view2.setFitHeight(20);
        view2.setFitWidth(20);
        view3.setFitHeight(20);
        view3.setFitWidth(20);
       // Label l = new Label("User Name", view);
        Button button = new Button("login", view);
         Button button2= new Button("login", view2);
          Button button3 = new Button("login", view3);
         // HBox hbox = new HBox(button,button2,button3);
          //hbox.setSpacing(20);
         // VBox vbox = new VBox(button,button2,button3);
         // vbox.setSpacing(20);
    /*    FlowPane flowpane = new FlowPane(button,button2,button3);
        flowpane.setVgap(20);
        flowpane.setHgap(20);
        flowpane.setOrientation(Orientation.VERTICAL);
*/
       
         /* GridPane gp = new GridPane();
          gp.add(button, 0, 0);
          gp.add(button2, 1, 0);
          gp.add(button3, 0, 1);
          gp.setVgap(20);
          gp.setHgap(20);
          */
         //TextField tf = new TextField("Pleas, Type Your name");
         // String s = tf.getText();
         
        // TextArea ta = new TextArea("Comment");
       // PasswordField pw = new PasswordField();
       
       /*
        ToggleGroup tg = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Left");
        rb1.setToggleGroup(tg);
         RadioButton rb2 = new RadioButton("Right");
        rb2.setToggleGroup(tg);
         RadioButton rb3 = new RadioButton("Down");
        rb3.setToggleGroup(tg);
         RadioButton rb4 = new RadioButton("Up");
        rb4.setToggleGroup(tg);
        */
       /*
        CheckBox chk = new CheckBox("Java");
        chk.setIndeterminate(true);
         CheckBox chk2 = new CheckBox("C");
          CheckBox chk3 = new CheckBox("C#");
         */ 
        /* ComboBox com = new ComboBox();
         com.getItems().addAll("Java","C","C++","php");
          */
         /* ListView lv = new ListView();
          lv.getItems().add("java");
          lv.getItems().add("C");
          lv.getItems().add("C++");
          lv.getItems().add("Php");
          lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
          */
         
         /*Slider s = new Slider(0, 100, 50);
         s.setShowTickLabels(true);
         s.setShowTickMarks(true);
         */
        /* ScrollBar sb = new ScrollBar();
         sb.setOrientation(Orientation.VERTICAL);
         */
       // DatePicker db = new DatePicker();
       ToggleGroup tg = new ToggleGroup();
        ToggleButton yes = new ToggleButton("yes");
        yes.setToggleGroup(tg);
        ToggleButton no = new ToggleButton("no");
        no.setToggleGroup(tg);
       
       
         HBox hbox = new HBox(yes,no);
         hbox.setSpacing(20);
        //Group group = new Group(button);
        Scene scene = new Scene(hbox,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello From Mohamed");
        primaryStage.show();
        
    }
    
    
    
            
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}