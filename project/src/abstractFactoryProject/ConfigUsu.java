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
    
    
    
    public ConfigUsu() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("ConfigUsu.fxml"));
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
    public void clickSalvar() {
       
    }

    @Override
    public void clickCancel() {
        
    }

    @Override
    public FXMLLoader getLoad() {
        return this.loader;
    }
    
}
