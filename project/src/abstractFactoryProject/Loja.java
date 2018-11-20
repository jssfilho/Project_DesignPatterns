/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;



import bridgeProject.Produto;
import java.awt.event.InputMethodEvent;
import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author Joao Santos
 */
public class Loja {
    private String nome;
    private String codLoja;
    private HashMap<Produto, Integer> map = new HashMap<>();
    
     @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;

    @FXML
    private TextField pesqProd;

    @FXML
    private RadioButton aliSelect;

    @FXML
    private RadioButton vestSelect;

    @FXML
    private RadioButton elecSelect;

    @FXML
    void clickConfig(ActionEvent event) {

    }

    @FXML
    void clickHome(ActionEvent event) {

    }

    @FXML
    void clickSair(ActionEvent event) {

    }

    @FXML
    void filtroAction(ActionEvent event) {

    }

    @FXML
    void pesquisar(InputMethodEvent event) {

    }

}
