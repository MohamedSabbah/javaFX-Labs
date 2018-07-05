/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class LoginHM extends Application {
	// Login GUI......
	private GridPane gp = new GridPane();
	private Label userNamelab = new Label("Username");  
	private Label passLab = new Label("Password");
	private TextField txt1 = new TextField();
	private PasswordField pass = new PasswordField();
	private Button loginBtn = new Button("Login");
	private Alert alert = new Alert(Alert.AlertType.INFORMATION, STYLESHEET_MODENA, ButtonType.OK);
    
	// Instructor GUI......
	
    @Override
    public void start(Stage primaryStage) {
        
    	// login GridPane...........
        
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        //------------------------------------------------------------------------------------------------------------------------------------------
        
         // The  Label
       
        gp.setHalignment(userNamelab, HPos.LEFT);
        gp.add(userNamelab, 0, 0);
        gp.setHalignment(passLab, HPos.LEFT);
        gp.add(passLab, 0, 1);
      //--------------------------------------------------------------------------------------------------------------------------------------------
        
        //The Fileds
        
        gp.setHalignment(txt1, HPos.RIGHT);
        gp.add(txt1, 1, 0);
        gp.setHalignment(pass, HPos.RIGHT);
        gp.add(pass, 1, 1);
        
        // the Button
       
        gp.setHalignment(loginBtn, HPos.LEFT);
        gp.add(loginBtn, 0, 2);
      
        loginBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
          @Override
        public void handle(MouseEvent event) {
            Connection conn = null;
            Statement stmt = null;
            ResultSet rset = null;
            PreparedStatement pstmt = null;
            try {
                  conn = MyConniction.getConnection();
                  System.out.println("connected.......");
                  pstmt = conn.prepareStatement("select userName, password from login where userName = ? and  password = ? ");	
                  pstmt.setString(1, txt1.getText());
                  pstmt.setString(2,pass.getText());
                  rset = pstmt.executeQuery();
                  if (rset.next()) {
                	  InstractorM inst = new InstractorM();
                	  primaryStage.setTitle("Instractor....");
                      primaryStage.setScene(inst.sMethod());
                  } else{
                         alert.setContentText("Filed Username or Password");
                         alert.show();
                    }
            } catch (SQLException ex) {
                  System.out.println(ex.getMessage()); 
              }
             
          }
      });
         
        
       InstractorM inst = new InstractorM();
    
        Scene scene = new Scene(gp, 300, 200);
        primaryStage.setTitle("Login Form..");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
