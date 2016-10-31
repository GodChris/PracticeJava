/**
 * Created by God of Chris on 2016/10/31 0031.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;

public class coins extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input a number from 0-511:");
        int num=input.nextInt();

        //定义一个str对象作为显示图片的下标
        String str = Integer.toBinaryString(num);
        while (str.length() < 9) {
            str = "0" + str;
        }

        Pane pane=new Pane();
        int counter=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Image image=new Image("imags/"+str.charAt(counter ++) + ".jpg");
                ImageView imgView = new ImageView(image);
                imgView.setFitHeight(200);
                imgView.setFitWidth(200);
                imgView.setX(j * 200);
                imgView.setY(i * 200);
                pane.getChildren().add(imgView);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("硬币");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
