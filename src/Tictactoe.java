/**
 * Created by God of Chris on 2016/10/31 0031.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Tictactoe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //创建面板,建立lineX，lineY输入井字
        Pane pane = new Pane();
        for(int i=0;i<4;i++){
            Line lineX = new Line(225,50 * i,375,50 * i);
            Line lineY = new Line(225 + 50 * i,0,225 + 50 * i,150);
            pane.getChildren().addAll(lineX,lineY);
        }

        //创建gridPane输入网格里节点的接口
        GridPane grid=new GridPane();
        //设置顶，右，底，左的内容填充
        grid.setPadding(new Insets(10, 10, 10, 10));
        //列之间的水平差距的宽度为5
        grid.setVgap(5);
        //行与行之间的垂直间距的高度为5
        grid.setHgap(5);

        //player1的接口

        //添加Lable对象显示文字“玩家一”到0列0行
        grid.add(new Label("玩家一:"),0,0);
        //设置文本域提示用户输入
        final TextField player1X = new TextField();
        //未输入时文本域里显示的文字
        player1X.setPromptText("输入1~3的数字");
        //设置文本域的首选列数
        player1X.setPrefColumnCount(5);

        final TextField player1Y = new TextField();
        player1Y.setPromptText("输入1~3的数字");
        player1Y.setPrefColumnCount(5);
        //添加lable到（1,0）位置
        grid.add(new Label("X:"),0,1);
        //添加文本域到（1,1）位置
        grid.add(player1X,1,1);
        grid.add(new Label("Y:"),2,1);
        grid.add(player1Y,3,1);
        Button submit1 = new Button("确定");
        grid.add(submit1,4,1);

        //player2的接口
        grid.add(new Label("玩家二:"),0,2);
        final TextField player2X = new TextField();
        player2X.setPromptText("输入1~3的数字");
        player2X.setPrefColumnCount(5);

        final TextField player2Y = new TextField();
        player2Y.setPromptText("输入1~3的数字");
        player2Y.setPrefColumnCount(5);

        grid.add(new Label("X:"),0,3);
        grid.add(player2X,1,3);
        grid.add(new Label("Y:"),2,3);
        grid.add(player2Y,3,3);
        Button submit2 = new Button("确定");
        grid.add(submit2,4,3);

        //把grid和pane放入vBox
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 0));
        vBox.getChildren().addAll(pane,grid);

        Scene scene = new Scene(vBox,600,600);

        primaryStage.setTitle("井字棋");
        primaryStage.setScene(scene);
        primaryStage.show();

        //提示玩家输入
        final Label label = new Label("请玩家一输入");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD,20));
        pane.getChildren().add(label);

        //创建数组存储赢得状态
        int[][] win = {
                {2,3,4},
                {5,6,7},
                {8,9,10}
        };

        int[] counter = {0};

        //Setting an action for the Submit1 button
        submit1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if ((player1X.getText() != null && !player1X.getText().isEmpty()) && (player1Y.getText() != null && !player1Y.getText().isEmpty())) {
                    int x = Integer.parseInt(player1X.getText()) - 1;
                    int y = Integer.parseInt(player1Y.getText()) - 1;
                    if (x < 0 || x > 2 || y < 0 || y > 2 || win[x][y] == 0 || win[x][y] == 1) {
                        label.setText("非法输入!!!");
                    }else{
                        Image img = new Image("imgs/01.gif");
                        ImageView imgView = new ImageView(img);
                        imgView.setFitHeight(50);
                        imgView.setFitWidth(50);
                        imgView.setX(x * 50 + 225);
                        imgView.setY(y * 50);
                        pane.getChildren().add(imgView);
                        win[x][y] = 1;
                        if (judgeWinner(win)) {
                            label.setText("玩家一胜利!!!");
                        }else if(++ counter[0] == 9){
                            label.setText("游戏结束,无人胜利!");
                        }else {
                            label.setText("请玩家二输入");
                        }
                    }
                } else {
                    label.setText("请输入值!!!");
                }

            }
        });


        //Setting an action for the Submit2 button
        submit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if ((player2X.getText() != null && !player2X.getText().isEmpty()) && (player2Y.getText() != null && !player2Y.getText().isEmpty())) {
                    int x = Integer.parseInt(player2X.getText()) - 1;
                    int y = Integer.parseInt(player2Y.getText()) - 1;
                    if (x < 0 || x > 2 || y < 0 || y > 2 || win[x][y] == 0 || win[x][y] == 1) {
                        label.setText("非法输入!!!");
                    }else{
                        Image img = new Image("imgs/00.gif");
                        ImageView imgView = new ImageView(img);
                        imgView.setFitHeight(50);
                        imgView.setFitWidth(50);
                        imgView.setX(x * 50 + 225);
                        imgView.setY(y * 50);
                        pane.getChildren().add(imgView);
                        win[x][y] = 0;
                        if (judgeWinner(win)) {
                            label.setText("玩家二胜利!!!");
                        }else if(++ counter[0] == 9){
                            label.setText("游戏结束,无人胜利!");
                        }else {
                            label.setText("请玩家一输入");
                        }
                    }
                } else {
                    label.setText("请输入值!!!");
                }

            }
        });
    }
    //the function to judge are there anyone win
    public static boolean judgeWinner(int[][] values){

        for (int i = 0; i < values.length; i ++) {

            int innerI = i, innerJ = 0, counterX = 1;

            while (innerJ < values[innerI].length - 1 && values[innerI][innerJ] == values[innerI][++ innerJ]) {
                if (++ counterX == 3) {
                    return true;
                }
            }

        }

        for (int j = 0; j < values[0].length; j ++) {

            int innerI = 0, innerJ = j, counterY = 1;

            while (innerI < values.length - 1 && values[innerI][innerJ] == values[++ innerI][innerJ]) {
                if (++ counterY == 3) {
                    return true;
                }
            }

        }

        if (values[0][0] == values[1][1] && values[1][1] == values[2][2]) {
            return true;
        }


        if (values[2][0] == values[1][1] && values[1][1] == values[0][2]) {
            return true;
        }

        return false;
    }
}
