package chapter10;/**
 * Created by God of Chris on 2016/11/22 0022.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class testCircle2D extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane=new Pane();
        Circle2D c1=new Circle2D(200,200,50);
        Circle2D c2=new Circle2D(210,190,25);
        Circle circle=new Circle(200,200,50);
        circle.setStroke(Color.NAVY);
        circle.setFill(Color.WHITE);

        Circle circle1=new Circle(210,190,25);
        circle1.setFill(Color.BLUE);

        Label label=new Label("The perimeters is "+c1.getPerimeter()+"\n"+"The area is "+c1.getArea()+"\n");

        if(c1.contains(c2)){
            Label label2=new Label("圆c2在圆c1内");
            label2.setTranslateY(c1.getY()+c1.getRadius()+20);
            label2.setTranslateX(c1.getX()-0.5*c1.getRadius());
            label2.setTextFill(Color.BLUE);
            pane.getChildren().addAll(label2);
        }
        label.setTextFill(Color.BLUE);
        pane.getChildren().addAll(circle,label,circle1);

        Scene scene=new Scene(pane,600,600);
        primaryStage.setTitle("showCircleZodiac");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
