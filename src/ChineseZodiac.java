/**
 * Created by God of Chris on 2016/10/23 0023.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class ChineseZodiac extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a year: ");
        int year = input.nextInt();
        System.out.println("The zodiac of "+year+" is in the pictures:");

        //display the circle
        Pane pane=new Pane();
        int X = 300,Y = 300, R = 250;
        Circle circle = new Circle(X,Y,R);
        circle.setStroke(Color.NAVY);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        //define the angle to display the line
        int angle = 0;

        //define the angle to display the images
        int imgAngle = 15;

        //display line
        for(int i=0;i<12;i++){
            Line line=new Line(X,Y,X + R * Math.sin(Math.toRadians(angle)),
                    Y - R * Math.cos(Math.toRadians(angle)));
            line.setStroke(Color.NAVY);
            angle += 30;
            pane.getChildren().add(line);

            //display 12 images
            Image img = new Image("imgs/" + i + ".jpg");
            ImageView imgView = new ImageView(img);
            imgView.setFitHeight(60);
            imgView.setFitWidth(60);
            imgView.setX(X + R / 1.5 * Math.sin(Math.toRadians(imgAngle)) - 30);
            imgView.setY(Y - R / 1.5 * Math.cos(Math.toRadians(imgAngle)) - 30);
            imgAngle += 30;
            pane.getChildren().add(imgView);
        }

        //display the pointer to point the zodiac
        Line pointer = new Line(X,Y,X + R / 1.75 * Math.sin(Math.toRadians(15 + year % 12 * 30)),
                Y - R / 1.75 * Math.cos(Math.toRadians(15 + year % 12 * 30)));
        pointer.setStroke(Color.BLUE);
        pane.getChildren().add(pointer);

        Scene scene=new Scene(pane,600,600);
        primaryStage.setTitle("showCircleZodiac");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}