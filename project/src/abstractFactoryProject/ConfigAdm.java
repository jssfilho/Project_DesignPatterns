/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
/**
 *
 * @author Joao Santos
 */
public class ConfigAdm implements Configuracoes{
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

    @Override
    @FXML
    public void clickHome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @FXML
    public void clickEdite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @FXML
    public void clickSair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
