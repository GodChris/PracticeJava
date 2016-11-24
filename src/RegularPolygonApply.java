
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class RegularPolygonApply extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Pane pane=new Pane();
        RegularPolygon rp1=new RegularPolygon(8,20,500,300);
        Polygon regularpolygon1=new Polygon();
        pane.getChildren().add(regularpolygon1);
        regularpolygon1.setFill(Color.RED);
        regularpolygon1.setStroke(Color.BLUE);
        ObservableList<Double> list1 = regularpolygon1.getPoints();

        double centerX = rp1.getX(), centerY = rp1.getY();
        double radius = Math.min(rp1.getX()*2, rp1.getY()*2) * 0.4;
        Label label=new Label("The perimeters is "+rp1.getPerimeter()+"\n"+"The area is "+rp1.getArea()+"\n");
        label.setFont(Font.font("Arial",20));
        label.setTranslateY(rp1.getY()-20);
        label.setTranslateX(rp1.getX()+radius+20);
        label.setOnMouseEntered(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                label.setScaleX(1.5);
                label.setScaleY(1.5);
            }
        });
        label.setOnMouseExited(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                label.setScaleX(1);
                label.setScaleY(1);
            }
        });
        label.setTextFill(Color.BLUE);
        pane.getChildren().add(label);

        for (int i = 0; i < rp1.getN(); i++) {
            list1.add(centerX + radius * Math.cos(2 * i * Math.PI /rp1.getN()));
            list1.add(centerY - radius * Math.sin(2 * i * Math.PI /rp1.getN()));
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 100, 100);
        primaryStage.setTitle("ShowPolygon"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
