/*
 * To change this license header, choose License Headers in SujeitoConcreto Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import bridgeProject.UsuarioSujeito;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import factoryMethod.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import observerProject.*;



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
    
    
    public Login() throws IOException{
        this.loader= new FXMLLoader(getClass().getResource("login.fxml"));
        
    }
    
    
    @FXML
    @Override
    public void cadastrar(ActionEvent event) {
        mainfx.OnChangeScene("Cadastro");
    }

    @FXML
    void loginMet(ActionEvent event) throws IOException {
        FacadeProject facc = new FacadeProject();
        UsuarioSujeito u = facc.uG(this.loginID.getText(), this.senhaID.getText());
        mainfx.c.setU(u);
    }

    @Override
    public FXMLLoader getParent() {
        return this.loader;
    }

 

}
