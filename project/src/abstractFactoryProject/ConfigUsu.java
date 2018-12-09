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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import observerProject.mainfx;

/**
 *
 * @author Joao Santos
 */
public class ConfigUsu implements Configuracoes{
    public FXMLLoader loader;
    @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;
    
    @FXML
    private Button salvarBtn;

    @FXML
    private Button cancelBtn;

    
    @FXML
    private TextField ftNum;

    @FXML
    private TextField ftRua;

    @FXML
    private TextField ftBairro;

    @FXML
    private TextField emailEdit;

    @FXML
    private TextField ftSenhaAt;

    @FXML
    private TextField ftSenhaNew;

    private FacadeProject fP;
    
    public ConfigUsu() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("ConfigUsu.fxml"));
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
        if(this.ftSenhaAt.getText().equals(mainfx.c.u.getSenha())){
            try {
                this.fP.editUsu(Integer.parseInt(this.ftNum.getText()), this.ftBairro.getText(), this.ftRua.getText(), this.emailEdit.getText(), this.ftSenhaNew.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConfigUsu.class.getName()).log(Level.SEVERE, null, ex);
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
