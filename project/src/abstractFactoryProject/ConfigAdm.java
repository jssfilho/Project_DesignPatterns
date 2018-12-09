/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import observerProject.mainfx;
/**
 *
 * @author Joao Santos
 */
public class ConfigAdm implements Configuracoes{
    
    public FXMLLoader loader;
    @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;

    @FXML
    private Button save;

    @FXML
    private Button cancel;

    @FXML
    private RadioButton dispon;

    @FXML
    private TextField emailEdit;

    @FXML
    private PasswordField senhaAt;

    @FXML
    private PasswordField senhaNew;
    private FacadeProject fP;
    
     public ConfigAdm() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("ConfigAdm.fxml"));
        this.loader=loade;
    }
    
    @Override
    @FXML
    public void clickHome(ActionEvent event) {
        mainfx.OnChangeScene("Home");
    }

    @Override
    @FXML
    public void clickEdite(ActionEvent event) {
        mainfx.OnChangeScene("Config");
    }

    @Override
    @FXML
    public void clickSair(ActionEvent event) {
        mainfx.OnChangeScene("Login");
    }

    @Override
    @FXML
     public void clickSalvar(ActionEvent event) {
        if(this.senhaAt.getText().equals(mainfx.c.u.getSenha())){
            try {
                this.fP = new FacadeProject();
                this.fP.editAdm(this.emailEdit.getText(), this.senhaNew.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConfigAdm.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }

    @Override
    @FXML
    public void clickCancel(ActionEvent event) {
        mainfx.OnChangeScene("Home");
    }

    @Override
    public FXMLLoader getLoad() {
        return this.loader;
    }
    
}
