/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Cadastro implements PaginaInicial{
    
  
    @FXML
    private TextField nomeUser;

    @FXML
    private TextField emailUser;

    @FXML
    private TextField cpfUser;

    @FXML
    private TextField bairro;

    @FXML
    private TextField rua;

    @FXML
    private TextField numEndereco;

    @FXML
    private TextField nomeLoja;

    @FXML
    private TextField cnpj;

    @FXML
    private RadioButton tipoUser;

    @FXML
    private Button cadastroBtn;

    @FXML
    private Button cancel;
    
    public FXMLLoader loader;
    
    
    public Cadastro() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("cadastro.fxml"));
        this.loader=loade;
    }
    
    @FXML
    @Override
    public void cadastrar(ActionEvent event) {

    }

    @FXML
    void cancelVoid(ActionEvent event) {

    }

    @Override
    public FXMLLoader getParent() {
        return this.loader;
    }


}