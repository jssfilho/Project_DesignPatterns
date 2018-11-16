/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;
import java.awt.event.InputMethodEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


/**
 *
 * @author Joao Santos
 */
public class HomeUsu implements Home{
    
    
    
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


    @FXML
    void filtroAction(ActionEvent event) {

    }

    @FXML
    void pesquisaLojaMet(InputMethodEvent event) {

    }
    
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
    
}
