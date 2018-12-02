/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;
import java.awt.event.InputMethodEvent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import observerProject.mainfx;


/**
 *
 * @author Joao Santos
 */
public class HomeUsu implements Home{
    
    
    public FXMLLoader loader;
    @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;

    @FXML
    private TextField pesquisaLoja;

    @FXML
    private RadioButton aliSelect;

    @FXML
    private RadioButton vestSelect;

    @FXML
    private RadioButton elecSelect;

    
     public HomeUsu() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("HomeUser.fxml"));
        this.loader=loade;
    }
    
    @FXML
    void filtroAction(ActionEvent event) {

    }

    @FXML
    void pesquisaLojaMet(InputMethodEvent event) {

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
    public FXMLLoader getLoad() {
        return this.loader;
    }
    
}
