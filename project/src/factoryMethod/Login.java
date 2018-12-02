/*
 * To change this license header, choose License Headers in SujeitoConcreto Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import abstractFactoryProject.FacadeProject;
import bridgeProject.Usuario;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

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
    void loginMet(ActionEvent event) throws IOException, ClassNotFoundException {
        FacadeProject facc = new FacadeProject();
        Usuario u = facc.loginMet(this.loginID.getText(), this.senhaID.getText());
        this.loginID.clear();
        this.senhaID.clear();
        mainfx.c.setU(u);
    }

    @Override
    public FXMLLoader getParent() {
        return this.loader;
    }

 

}
