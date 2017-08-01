/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
/**
 *
 * @author nico
 */
public class FXMain extends Application {
    
    public static void main(String[] args) {
        Application.launch(FXMain.class, args);
    }
   @Override
   public void start(Stage primarystage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login/LoginView.fxml"));        
        Scene scene = new Scene(root);        
        primarystage.setTitle("Login - [Grupo Delta]");
        primarystage.setScene(scene);
        primarystage.show();
    }

    
}
