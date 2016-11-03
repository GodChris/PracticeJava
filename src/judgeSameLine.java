/**
 * Created by God of Chris on 2016/11/1 0001.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class judgeSameLine extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

            Scene scene=new Scene(new LinePane(),100,100);
            primaryStage.setTitle("判断所有点是否在同一直线问题");
            primaryStage.setScene(scene);
            primaryStage.show();

    }
}
class LinePane extends Pane{
    public LinePane(){
        Scanner input =new Scanner(System.in);
        System.out.print("Please input the number of total points: ");
        int num=input.nextInt();

        double[][] points=new double[num][2];
        System.out.print("Please input "+num+" points:");
        for(int i=0;i<points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        for(int i=0;i<points.length-1;i++) {
            Line line = new Line(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1]);
            getChildren().add(line);
        }

        //显示结果
        String result=sameLine(points)? "在同一条直线上" : "不在同一条直线上";
        System.out.print(sameLine(points)? "在同一条直线上" : "不在同一条直线上");
        Label label = new Label(result);
        getChildren().add(label);
    }
    public static boolean sameLine(double[][] points){
        //斜率相等判断在一条直线上,取前两个点算出斜率
        double slope=(points[0][1]-points[1][1])/(points[0][0]-points[1][0]);
        for(int i=1;i<points.length;i++){
            if((points[i][1]-points[i+1][1])/(points[i][0]-points[i+1][0])!=slope){
                return false;
            }
            return true;
        }
        return false;
    }
}
