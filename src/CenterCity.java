/**
 * Created by God of Chris on 2016/11/1 0001.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class CenterCity extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please input the number of cities: ");
        int num=input.nextInt();

        System.out.print("Please input the abscissa(X) and ordinate(Y) of "+num+" city:");
        double[][] location=new double[num][2];
        for(int i=0;i<num;i++){
            location[i][0]=input.nextDouble();
            location[i][1]=input.nextDouble();
        }

        double closestDistane = 0;
        for (int i = 0;i < location.length; i ++) {
            closestDistane += Math.sqrt((location[i][0] - location[0][0]) * (location[i][0] - location[0][0])
                    + (location[i][1] - location[0][1]) * (location[i][1] - location[0][1]));
        }
        int index = 0;

        //构建数组存储每个城市和所有其他城市距离的和
        double[] distances = new double[num];

        for (int i = 0; i < num; i ++) {
            for (int j = 0; j < num; j ++) {
                distances[i] += Math.sqrt((location[j][0] - location[i][0]) * (location[j][0] - location[i][0]) +
                        (location[j][1] - location[i][1]) * (location[j][1] - location[i][1]));
            }
            if (closestDistane > distances[i]) {
                closestDistane = distances[i];
                index = i;
            }
        }

        System.out.println("The center city is NO." + (index + 1) + ", and the minimum total distane is : " + closestDistane);

        Pane pane = new Pane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        //打印直线
        for (int i = 0; i < num - 1; i ++) {
            Line line = new Line(location[i][0],location[i][1],location[i + 1][0],location[i + 1][1]);
            pane.getChildren().add(line);
        }

        //显示中心城市
        for (int i = 0; i < num; i ++) {
            Image img;
            if (i == index) {
                img = new Image("cities/0.png");
            }else {
                img = new Image("cities/1.png");
            }
            ImageView imgView = new ImageView(img);
            imgView.setFitHeight(30);
            imgView.setFitWidth(30);
            imgView.setX(location[i][0] - 15);
            imgView.setY(location[i][1] - 15);
            pane.getChildren().add(imgView);
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("中心城市");
        primaryStage.setScene(scene);
        primaryStage.setHeight(1000);
        primaryStage.setWidth(1000);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
}
