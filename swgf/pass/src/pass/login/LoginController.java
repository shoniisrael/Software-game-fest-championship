/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pass.login;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author nico
 */


public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
@FXML
private Button entra;
@FXML
private void ActionBotonEntrar(ActionEvent event) throws IOException
{
   Parent parent = FXMLLoader.load(getClass().getResource("Principal.fxml"));
   Scene scene = new Scene(parent);
   Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
   stage.setScene(scene);
   stage.show();

}
    public void initialize(URL url, ResourceBundle rb) {
    }
}
