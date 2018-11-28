/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class Login implements PaginaInicial {
    
    @FXML
    private Button entrar;

    @FXML
    private Button cadastrar;

    @FXML
    private PasswordField senhaID;

    @FXML
    private TextField loginID;
    
    public FXMLLoader loader;
    
    
    public Login(){
        this.loader = new FXMLLoader(getClass().getResource("login.fxml"));
    }
    
    
    @FXML
    @Override
    public void cadastrar(ActionEvent event) {

    }

    @FXML
    void loginMet(ActionEvent event) {

    }

 

}
