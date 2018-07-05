/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import javafx.application.Application;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Sab
 */
public class Registration extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.TOP_LEFT);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
        
        // label name and textfield
        Label name = new Label("Name");
        name.setTranslateX(10);
        name.setTranslateY(10);
        grid.setHalignment(name, HPos.LEFT);
        grid.add(name, 1, 0);
        
        TextField txt1 = new TextField();
        txt1.setTranslateY(10);
        grid.setHalignment(txt1, HPos.CENTER);
        grid.add(txt1, 2, 0);
       //-------------------------------------------------------------------------------------------------------------------------------
       
        //label dateOfbirth and Datebicker
        Label dateOfBirth = new Label("Date of Birth");
        dateOfBirth.setTranslateX(10);
        dateOfBirth.setTranslateY(20);
        grid.setHalignment(dateOfBirth, HPos.LEFT);
        grid.add(dateOfBirth, 1, 1);
        
        DatePicker date = new DatePicker();
        date.setTranslateY(20);
        grid.setHalignment(date, HPos.LEFT);
        grid.add(date, 2, 1);
       //---------------------------------------------------------------------------------------------------------------------------
       
        // label gender and radiobuttons....
        Label gender = new Label("Gender");
        gender.setTranslateX(10);
        gender.setTranslateY(30);
        grid.setHalignment(gender, HPos.LEFT);
        grid.add(gender, 1, 2);
        
        RadioButton male = new RadioButton("Male");
        male.setTranslateY(30);
        grid.setHalignment(male, HPos.LEFT);
        grid.add(male, 2, 2);
        
        RadioButton female = new RadioButton("Female");
        female.setTranslateY(30);
        grid.setHalignment(female, HPos.RIGHT);
        grid.add(female, 2, 2);
        //-----------------------------------------------------------------------------------------------------------------------------
        
        // label reservation and togglebuttons
        Label reservation = new  Label("Reservation");
        reservation.setTranslateX(10);
        reservation.setTranslateY(40);
        grid.setHalignment(reservation, HPos.LEFT);
        grid.add(reservation, 1, 3);
        
        ToggleButton yes = new ToggleButton("Yes");
        yes.setTranslateY(40);
        grid.setHalignment(yes, HPos.LEFT);
        grid.add(yes, 2, 3);
        
        ToggleButton no = new ToggleButton("No");
        no.setTranslateY(40);
        grid.setHalignment(no, HPos.RIGHT);
        grid.add(no, 2, 3);
      //---------------------------------------------------------------------------------------------------------------------------------
      
      //lable technologies Known and checkboxes
        Label techKnown = new Label("Technologies Known");
        techKnown.setTranslateX(10);
        techKnown.setTranslateY(50);
        grid.setHalignment(techKnown, HPos.LEFT);
        grid.add(techKnown, 1, 4);
        
        CheckBox java = new CheckBox("Java");
        java.setTranslateY(50);
        grid.setHalignment(java, HPos.LEFT);
        grid.add(java, 2, 4);
        
        CheckBox dotnet = new CheckBox("DotNet");
        dotnet.setTranslateY(50);
        grid.setHalignment(dotnet, HPos.RIGHT);
        grid.add(dotnet, 2, 4);
        //-----------------------------------------------------------------------------------------------------------------------
        
        // label educqualification and listview
        Label educQualification = new Label("Educational Qualification");
        educQualification.setTranslateX(10);
        educQualification.setTranslateY(70);
        grid.setHalignment(educQualification, HPos.LEFT);
        grid.add(educQualification, 1, 5);
        
        ListView list = new ListView();
        list.getItems().add("Engineering");
        list.getItems().add("MCSA");
        list.getItems().add("MBA");
        list.getItems().add("Graduation");
        list.getItems().add("Mtech");
        list.getItems().add("Mphli");
        list.getItems().add("Phd");
        list.setTranslateY(70);
        grid.setHalignment(list, HPos.LEFT);
        grid.add(list, 2, 5);
        //-------------------------------------------------------------------------------------------------------------------------
        
       // label location and combox
        Label location = new Label("Location");
        location.setTranslateX(10);
        location.setTranslateY(70);
        grid.setHalignment(location, HPos.LEFT);
        grid.add(location, 1, 6);
        
        ComboBox com = new ComboBox();
        com.setTranslateY(70);
        com.getItems().addAll("Egypt","Germany","Poland", "Italy", "Spain","England","USA");
        grid.setHalignment(com, HPos.LEFT);
        grid.add(com, 2, 6);
        //-----------------------------------------------------------------------------------------------------------------------------
        // button Register
        Button register = new Button("Register");
        
        register.setTranslateY(80);
        grid.setHalignment(register, HPos.RIGHT);
        grid.add(register, 2,7 );
        
     
     
      //  StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 600, 800);
        
        primaryStage.setTitle("Registration Form");
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
