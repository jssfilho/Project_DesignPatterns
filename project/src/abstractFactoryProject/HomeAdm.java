/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.awt.event.InputMethodEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Joao Santos
 */
public class HomeAdm implements Home{
    public FXMLLoader loader;
    @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;

    @FXML
    private Button saveProdBtn;

    @FXML
    private ChoiceBox tipoCadastroProd = new ChoiceBox(FXCollections.observableArrayList("Alimento", "Eletrônico", "Vestimenta"));;

    @FXML
    private Label opcaoLbCadas;

    @FXML
    private TextField codCadastro;

    @FXML
    private TextField precoCadastro;

    @FXML
    private TextField nomeCadastro;

    @FXML
    private TextArea descriCadastro;

    @FXML
    private TextField opcaoCadastro;

    @FXML
    private TextField rmCod;

    @FXML
    private Button rmBtn;

    @FXML
    private TextField pesquisaEstoq;

    @FXML
    private Label mostraEstoq;

    @FXML
    private Label valorReceita;
    
    public HomeAdm() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("HomeAdm.fxml"));
        this.loader=loade;
    }
    
    @FXML
    void getProdEstoq(InputMethodEvent event) {
        
    }

    @FXML
    void cadastroTipo(InputMethodEvent event){
        String v = (String) this.tipoCadastroProd.getValue();
        switch (v) {
            case "Alimento":
                this.opcaoLbCadas.setText("Validade");
                break;
            case "Eletrônico":
                this.opcaoLbCadas.setText("Garantia");
                break;
            default:
                this.opcaoLbCadas.setText("Tamanho");
                break;
        }
    }

    @FXML
    void rmProduto(ActionEvent event) {
        
    }

    @FXML
    void salvaProduto(ActionEvent event) {
        
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

    @Override
    public FXMLLoader getLoad() {
       return this.loader;
    }
    
}
