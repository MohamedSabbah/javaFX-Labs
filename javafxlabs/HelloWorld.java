/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 *
 * @author Sab
 */
public class HelloWorld extends Application{

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException  {
        //Line
       // Line line = new Line(0, 20, 60, 20);
      /*  Line line = new Line();
        line.setStartX(10);
        line.setEndY(10);
        
         line.setStartX(50);
        line.setEndY(60);*/
      
      //......................................................
        //retangle
      
      //Rectangle rec = new Rectangle(50, 50, 100, 120);
       /* Rectangle rec = new Rectangle();
        rec.setHeight(200);
        rec.setWidth(300);
        rec.setArcHeight(30);
        rec.setArcWidth(30); */
       
       
       // Circle circle = new  Circle(300, 300, 100);
       // Ellipse ellipse = new Ellipse(300, 300, 200, 100);
        //Group root = new Group(line);
        
       /* Polygon poly = new Polygon(100,200,200,200,200,300,100,300);
         //Polyline poly = new Polyline(100,200,200,200,200,300,100,300);
         poly.setFill(Color.DARKGRAY);
         poly.setStroke(Color.BROWN);
         poly.setStrokeType(StrokeType.OUTSIDE);
         poly.setStrokeLineJoin(StrokeLineJoin.BEVEL);
         poly.setStrokeWidth(5);*/
       /* MoveTo moveto = new MoveTo(232, 52);
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
      /* Circle cir1 = new Circle(200, 135, 100, Color.BLUEVIOLET);
        Circle cir2 = new Circle(290, 135, 100, Color.CORAL);
       Shape shape = Shape.intersect(cir1, cir2);
       //Shape shape1 = Shape.subtract(cir1, cir2);
       //Shape shape2 = Shape.union(cir1, cir2);
       shape.setFill(Color.BLUEVIOLET);
       // shape1.setFill(Color.CADETBLUE);
         //shape2.setFill(Color.CORNFLOWERBLUE);
       */
      /*  Box box = new Box(100,100, 100);
        
        box.setTranslateX(100);
        box.setTranslateY(100);
        box.setTranslateZ(100);
        box.set
        PhongMaterial pm = new PhongMaterial();
        pm.setDiffuseColor(Color.AQUA);
        pm.setSpecularColor(Color.BLUE);
        box.setMaterial(pm);
      Sphere sphere = new Sphere(50, 20);
        sphere.setTranslateX(100);
        sphere.setTranslateY(200);
        sphere.setTranslateZ(100);
        PhongMaterial pm = new PhongMaterial();
        pm.setDiffuseColor(Color.CHOCOLATE);
        pm.setSpecularColor(Color.AQUA);
        sphere.setMaterial(pm);
      */
      /*
        Cylinder cylinder = new Cylinder(200, 200, 50);
        cylinder.setTranslateX(100);
        cylinder.setTranslateY(200);
        cylinder.setTranslateZ(200);
        PhongMaterial pm = new PhongMaterial();
         pm.setSpecularColor(Color.BROWN);
         cylinder.setMaterial(pm);
         cylinder.setDrawMode(DrawMode.FILL);
         cylinder.setCullFace(CullFace.FRONT);
        */
          /*  Box box = new Box(100,100, 100);
             box.setTranslateX(100);
             box.setTranslateY(100);
             box.setTranslateZ(100);
              PhongMaterial pm = new PhongMaterial();
        pm.setDiffuseColor(Color.AQUA);
        pm.setSpecularColor(Color.BLUE);
        
        box.setMaterial(pm);
        box.setDrawMode(DrawMode.LINE);
        */
        Image image = new Image(new FileInputStream ("Images\\sab1.jpg"));
        ImageView view = new ImageView(image);
        view.setFitHeight(300);
        view.setFitWidth(300);
        view.setPreserveRatio(true);
        view.setX(100);
        view.setY(100);
        
        //////////////////////7
         Image image1 = new Image(new FileInputStream ("Images\\IMG_20141019_140340.jpg"));
        ImageView view2 = new ImageView(image1);
        view2.setFitHeight(300);
        view2.setFitWidth(300);
        view2.setPreserveRatio(true);
        view2.setX(10);
        view2.setY(10);
        
        ///////
        Sphere sphere = new Sphere(100, 100);
        sphere.setTranslateX(100);
        sphere.setTranslateY(200);
        sphere.setTranslateZ(100);
        PhongMaterial pm = new PhongMaterial();
        pm.setSelfIlluminationMap(new Image(new FileInputStream("Images\\IMG_20141025_220206.jpg"))) ;
        
        sphere.setMaterial(pm);
      
        Group root = new Group(view, view2,sphere);
      //  root.getChildren().add(poly);
        
        Scene scene = new Scene(root, 500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome to My World");
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    




















    
}