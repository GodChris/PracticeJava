/**
 * Created by God of Chris on 2016/11/1 0001.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class cardDrafting extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int[]deck=new int[52];
        //Spades:黑桃，Hearts:红桃，Diamond:方块，Clubs:梅花
        String[] suits={"Spades","Hearts","Diamond","Clubs"};
        int[] ranks={1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0;i<deck.length;i++)
            deck[i]=i;

        Pane pane=new Pane();
        int count=0;
        for(int k=0;k<1000;k++){
            System.out.println("第"+(count+1)+"次选牌：");
            for(int i=0;i<deck.length;i++){
                int index=(int)(Math.random()*deck.length);
                int temp=deck[i];
                deck[i]=deck[index];
                deck[index]=temp;
            }
            int total=0;
            for(int i=0;i<4;i++){
                    //牌的花色
                    String suit = suits[deck[i] / 13];
                    //具体那张牌
                    int rank = ranks[deck[i] % 13];

                    Image image = new Image("cards/" + deck[i] + ".png");
                    ImageView imgView = new ImageView(image);
                    imgView.setFitHeight(100);
                    imgView.setFitWidth(100);
                    imgView.setX(i * 100);
                    imgView.setY(20);
                    pane.getChildren().add(imgView);
                    total += rank;
                    System.out.println("Card number " + deck[i] + ":" + rank + " of " + suit);

            }
            System.out.print("\n");
            count++;
            if(total==24){
                System.out.println("这是第"+count+"次选到四张牌的和为24");

                pane.getChildren().add(new Label("这是第"+count+"次选到四张牌的和为24"));
                break;
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("选牌");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
