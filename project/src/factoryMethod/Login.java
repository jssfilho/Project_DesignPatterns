/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.io.IOException;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Login extends VBox {
    
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
    void getCadastro(ActionEvent event) {

    }

    @FXML
    void loginMet(ActionEvent event) {

    }
    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return loginID.textProperty();
    }
 

}
