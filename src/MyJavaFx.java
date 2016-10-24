/**
 * Created by God of Chris on 2016/10/14 0014.
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MyJavaFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btok=new Button("");
        Scene scene=new Scene(btok,200,250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
