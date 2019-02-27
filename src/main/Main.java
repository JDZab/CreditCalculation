package main;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
        primaryStage.setTitle("Расчет кредита");
        primaryStage.setScene(new Scene(root));
        MainController.setStage(primaryStage);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
