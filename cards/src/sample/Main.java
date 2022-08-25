//Developed By Amar
package sample;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import java.lang.Exception;
import java.io.*;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Random rand = new Random();
        ArrayList<Image> list = new ArrayList<Image>(); //creating an Arraylist to call the images
        Pane pane = new HBox();
        ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52));
        System.out.println(l);
        for(int i = 0;i<3;i++)
        {
            int index = rand.nextInt(l.size());
            Image image52 = new Image(new FileInputStream("D:\\New folder\\cards\\"+l.get(index)+".png"));
            pane.getChildren().add(new ImageView(image52));
        }
        pane.setPadding(new Insets(5, 5, 5,5));
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
