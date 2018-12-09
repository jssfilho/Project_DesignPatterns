/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import bridgeProject.*;

import java.io.IOException;
import java.sql.SQLException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import observerProject.mainfx;

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
    //aqui começa a parte de cadastro e remoção de produtos
    
    @FXML
    private Button saveProdBtn;
    
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
    //aqui termina
    
    @FXML
    private TextField pesquisaEstoq;

    @FXML
    private Label mostraEstoq;

    @FXML
    private Label valorReceita;
    
    @FXML
    private RadioButton tipoCadastroAlim;

    @FXML
    private RadioButton tipoCadastroEletro;

    @FXML
    private RadioButton tipoCadastroVesti;
    
    private int tipoProd;
    
    @FXML
    private Button pesquisarProd;
    
    private FacadeProject fP;
    
    public HomeAdm() throws IOException, ClassNotFoundException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("HomeAdm.fxml"));
        this.loader=loade;
        this.fP= new FacadeProject();
    }
    
    @FXML
    void getProdEstoq(ActionEvent event) {
        BancoProdutos p = new BancoProdutos();
        Produto pb = null;
        pb=p.getProduto(this.pesquisaEstoq.getText(), pb);
        if (pb!=null)
            this.mostraEstoq.setText(""+pb.getNome()+" "+pb.getPreco()+" "+pb.getCodBarra());
    }

    @FXML
    void cadastroAlimento(ActionEvent event) {
        this.opcaoLbCadas.setText("Válidade");
        this.tipoProd=1;
    }

    @FXML
    void cadastroEletro(ActionEvent event) {
        this.opcaoLbCadas.setText("Garantia");
        this.tipoProd=2;
    }

    @FXML
    void cadastroVesti(ActionEvent event)  {
        this.opcaoLbCadas.setText("Tamanho");
        this.tipoProd=3;
    }

    @FXML
    void rmProduto(ActionEvent event) throws SQLException, ClassNotFoundException {
        BancoProdutos p = new BancoProdutos();
        p.removeProd(this.rmCod.getText());
    }

    @FXML
    void salvaProduto(ActionEvent event) throws  RuntimeException, SQLException, ClassNotFoundException{
       try{
           BancoProdutos p = new BancoProdutos();
           switch (this.tipoProd) {
               case 1:
                  p.createProduto(1, this.codCadastro.getText(), this.nomeCadastro.getText(), Float.parseFloat(this.precoCadastro.getText()), this.descriCadastro.getText(), this.opcaoCadastro.getText());
                   break;
               case 2:
                   p.createProduto(2, this.codCadastro.getText(), this.nomeCadastro.getText(), Float.parseFloat(this.precoCadastro.getText()), this.descriCadastro.getText(), this.opcaoCadastro.getText());
                   break;
               case 3:
                   p.createProduto(3, this.codCadastro.getText(), this.nomeCadastro.getText(), Float.parseFloat(this.precoCadastro.getText()), this.descriCadastro.getText(), this.opcaoCadastro.getText());
                   break;
               default:
                   break;
           }
        
       
       }catch(RuntimeException erroDigit){
           throw new RuntimeException("Erro na conexão ", erroDigit);
       }
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
