package finalpro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


class InstractorM {
	private GridPane gp2 = new GridPane();
	private Label id = new Label("ID");
	private Label name = new Label("Name");
	private Label address = new Label("Address");
	private Label phone = new Label("Phone");
	private Label mobile = new Label("Mobile");
	private Label email = new Label("Email");
	private Label workHours = new Label("Work Hours");
	private Label proLang = new Label("Programming Language");
	private TextField txtId = new TextField();
	private TextField txtName = new TextField();
	private TextField txtAddress = new TextField();
	private TextField txtPhone = new TextField();
	private TextField txtMobile = new TextField();
	private TextField txtEmail = new TextField();
	private RadioButton fullTime = new RadioButton("Full Time");
	private RadioButton partTime = new RadioButton("Part Time");
	private ComboBox langBox = new ComboBox();
	private Button new1 = new Button("New");
	private Button save = new Button("Save");
	private Button edit = new Button("Edit");
	private Button delet = new Button("Delete");
	private Button search = new Button("Search");
	private HBox hb = new HBox(new1, save, edit, delet, search);
	private TextInputDialog txtDailog = new TextInputDialog();
	private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rset = null;
    private PreparedStatement pstmt = null;
	
	Scene sMethod() {
		 // GradPane Instructor.....
        gp2.setAlignment(Pos.TOP_LEFT);
        gp2.setHgap(20);
        gp2.setVgap(10);
        gp2.setPadding(new Insets(25, 25, 25, 25));
        
        // ID Label and ID TextField
        // ID label
        id.setTranslateX(10);
        id.setTranslateY(10);
        gp2.add(id, 1, 0);
        
        // ID Text Field
        txtId.setTranslateY(10);
        gp2.add(txtId, 2, 0);
        
        // Name Label and Name TextField
        name.setTranslateX(10);
        name.setTranslateY(20);
        gp2.add(name, 1, 1);
        
        // Name text Field
        txtName.setTranslateY(20);
        gp2.add(txtName, 2, 1);
        
        // Address Label and Address TextField
        address.setTranslateX(10);
        address.setTranslateY(30);
        gp2.add(address, 1, 2);
        
        // Address text Field
        txtAddress.setTranslateY(30);       
        gp2.add(txtAddress, 2, 2);
        
        // Phone Label and Phone TextField
        phone.setTranslateX(10);
        phone.setTranslateY(40);
        gp2.add(phone, 1, 3);
        
        // Phone text Field 
        txtPhone.setTranslateY(40);
        gp2.add(txtPhone, 2, 3);
        
        // Mobile Label and Mobile TextField
        mobile.setTranslateX(10);
        mobile.setTranslateY(50);       
        gp2.add(mobile, 1, 4);
        
        // Mobile text Field
        txtMobile.setTranslateY(50);       
        gp2.add(txtMobile, 2, 4);
        
        // Email Label and Email TextField
        email.setTranslateX(10);
        email.setTranslateY(60);     
        gp2.add(email, 1, 5);
        
        // Email text Field
        txtEmail.setTranslateY(60);       
        gp2.add(txtEmail, 2, 5);
        
       // Work Hours Label and full time and part time radio button
        workHours.setTranslateX(10);
        workHours.setTranslateY(70);        
        gp2.add(workHours, 1, 6);
        
        // RadioButton Full Time
        fullTime.setTranslateY(70);
        gp2.add(fullTime, 2, 6);
        
        // RadioButton Part Time
        partTime.setTranslateY(70);
        
        gp2.add(partTime, 3, 6);
        
        
        
        //Programming Language Label
        proLang.setTranslateX(10);
        proLang.setTranslateY(80);
        gp2.add(proLang, 1, 7);
        
        // language comboBox
        langBox.setTranslateY(80);
        langBox.getItems().addAll("Java","C#","VB", "PHP", "C");
        gp2.add(langBox, 2, 7);
        
        // Buttons  
        // vbox
        hb.setTranslateY(90);
        hb.setSpacing(20);
        gp2.add(hb, 2, 9);
        gp2.setColumnSpan(hb, 4);
        
        // new button
        new1.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
			txtId.clear();	
			txtName.clear();
			txtAddress.clear();
			txtPhone.clear();
			txtMobile.clear();
			txtEmail.clear();
				
			}
		});
        
        //save button
        save.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				try {
					conn = MyConniction.getConnection();
					System.out.println("connected.......");
	                pstmt = conn.prepareStatement("insert into instructor_info value (?,?,?,?,?,?,?,?)");
	                pstmt.setString(1, txtId.getText());
	                pstmt.setString(2, txtName.getText());
	                pstmt.setString(3, txtAddress.getText());
	                pstmt.setString(4, txtPhone.getText());
	                pstmt.setString(5, txtMobile.getText());
	                pstmt.setString(6, txtEmail.getText());
	                if (fullTime.isSelected()) pstmt.setString(7, "f");
	                else pstmt.setString(7, "p");
	                pstmt.setString(8, (String) langBox.getValue());
	                pstmt.executeUpdate();
	                conn.commit();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
			    	try {if(rset != null)rset.close();} catch (SQLException e) {e.printStackTrace();}
					try {if(conn != null)conn.close();} catch (SQLException e) {e.printStackTrace();}
					try {if(pstmt != null)pstmt.close();} catch (SQLException e) {e.printStackTrace();}
					
				}
                	
                
				
			}
        	
		});
        
        //search button
        search.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				txtDailog.setContentText("Please, Enter the ID");
				txtDailog.show();
				
				
			}
		});
        
        // text Dailog hidden
        txtDailog.setOnHidden(new EventHandler<DialogEvent>() {

			@Override
			public void handle(DialogEvent event) {
					int x = Integer.parseInt(txtDailog.getResult());
					
				System.out.println(x);
				try {
					conn = MyConniction.getConnection();
					System.out.println("connected.......");
					pstmt = conn.prepareStatement("select * from instructor_info where id = ?");
					pstmt.setInt(1, x);
					rset = pstmt.executeQuery();
					
					
					while (rset.next()) {
						
						int i = rset.getInt("id");
						String s = String.valueOf(i);
						System.out.println(i+s);
						txtId.setText(s);
						txtName.setText(rset.getString("name"));
						txtAddress.setText(rset.getString("address"));
						txtPhone.setText(rset.getString("phone"));
						txtMobile.setText(rset.getString("mobile"));
						txtEmail.setText(rset.getString("email"));
						String workHours=(rset.getString("work_hours"));
						if(workHours.equals("p")) partTime.setSelected(true);
						else fullTime.setSelected(true);
						langBox.setValue(rset.getString("pro_language"));
						
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
			    	try {if(rset != null)rset.close();} catch (SQLException e) {e.printStackTrace();}
					try {if(conn != null)conn.close();} catch (SQLException e) {e.printStackTrace();}
					try {if(pstmt != null)pstmt.close();} catch (SQLException e) {e.printStackTrace();}
					
				}	
				
				
				
			}
		});
        
        
        // Edit Button 
        edit.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				try {
					conn = MyConniction.getConnection();
					System.out.println("connected.......");
					pstmt = conn.prepareStatement("update instructor_info set where id = ?");
				
					 pstmt.executeUpdate();
		             conn.commit();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}finally {
			    	
					try {if(conn != null)conn.close();} catch (SQLException e) {e.printStackTrace();}
					try {if(pstmt != null)pstmt.close();} catch (SQLException e) {e.printStackTrace();}
					
				}	
				
				
			}
		});
   
        
    
        Scene scene2 = new Scene(gp2, 700, 500);
      
		
		return scene2;
	}

}
