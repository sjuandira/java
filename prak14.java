/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak14_salsabilajuandira;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Praktikan
 */
public class Prak14_SalsabilaJuandira extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Salsabila Juandira 217051012");
        stage.setScene(scene);
        stage.show();
        
//        Button btn1= new Button("Salju cantik <3");
//        Label txt= new Label("");
//        
//        btn1.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                txt.setText("Affh iyh?");
//                txt.setAlignment(Pos.BOTTOM_CENTER);
//            }
//        });                  
//        VBox root= new VBox();
//        root.getChildren().add(btn1);
//        root.getChildren().add(txt);
//        
//        //root.getChildren().add(btn2);
//        root.setAlignment(Pos.CENTER);
//        
//        Scene scene= new Scene(root);
//        
//        stage.setHeight(300);
//        stage.setWidth(300);
//        stage.setScene(scene);
//        stage.setTitle("Salju cantik <3!");
//        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
