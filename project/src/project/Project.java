/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
https://stackoverflow.com/questions/40698481/javafx-errors-with-fxmlloader-loadgetclass-getclassloader-getresourcelogi
 */
package project;

import bridgeProject.Fornecedor;
import bridgeProject.Cliente;
import bridgeProject.UsuarioSujeito;
import javafx.application.Application;

import javafx.stage.Stage;
import abstractFactoryProject.*;

import factoryMethod.*;
import javafx.scene.Scene;
import observerProject.*;
/**
 *
 * @author Joao Santos
 */
public class Project extends Application {
    private Stage stage;
    private static SujeitoConcreto user = null;
    private static Factory fac = null;
    private static FacDefault facd = new FacLogin();
    
    
    public void startObserver(String u){
        if(u.equals("cliente")){
            Project.fac = new FacCliente();
        }else{
            Project.fac = new FacAdm();
        }
        View vHome = new View(Project.fac.getHome().getLoad());
        View vConfig = new View(Project.fac.getHome().getLoad());
        

    }
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage.setScene(new Scene(facd.getCena().getParent().load()));
        
        this.stage.show();
    }
    public void atualizar(Scene v) throws Exception{
        this.start(this.stage);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
