/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.io.IOException;
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
    
    
     public ConfigAdm() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("ConfigAdm.fxml"));
        this.loader=loade;
    }
    
    @Override
    @FXML
    public void clickHome() {
        mainfx.OnChangeScene("Home");
    }

    @Override
    @FXML
    public void clickEdite() {
        mainfx.OnChangeScene("Config");
    }

    @Override
    @FXML
    public void clickSair() {
        mainfx.OnChangeScene("Login");
    }

    @Override
    @FXML
    public void clickSalvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @FXML
    public void clickCancel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FXMLLoader getLoad() {
        return this.loader;
    }
    
}
