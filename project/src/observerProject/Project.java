/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
https://stackoverflow.com/questions/40698481/javafx-errors-with-fxmlloader-loadgetclass-getclassloader-getresourcelogi
 */
package observerProject;

import bridgeProject.Fornecedor;
import bridgeProject.Cliente;
import bridgeProject.UsuarioSujeito;


import javafx.stage.Stage;
import abstractFactoryProject.*;

import factoryMethod.*;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;

/**
 *
 * @author Joao Santos
 */
public class Project extends Application {
    protected ArrayList<Observador> observadores = new ArrayList();
    private static Factory fac = null;
    private  FacDefault facd;
    public UsuarioSujeito u = null;
    public String viewAtual = "Login";
    
    
    public void add(Observador ob){
        this.observadores.add(ob);
    }
    public void rem(Observador ob){
        this.observadores.remove(ob);
    }
    public void notifique(){
        for(Observador ob: this.observadores){
            ob.update();
        }
    }
    
    public UsuarioSujeito getU(){
        return u;
    }
    public void setU(UsuarioSujeito u){
        this.u=u;
    }
    public void initOne() throws IOException{
        this.facd = new FacLogin();
        PaginaInicial d = this.facd.getCena();
        View vLogin = new View(d.getParent().load(),"Login");
        this.facd = new FacCadastro();
        d = this.facd.getCena();
        View vCadastro = new View(d.getParent().load(),"Cadastro");
        this.add(vLogin);
        this.add(vCadastro);
    }
    public void initTwo(boolean tipo) throws IOException{
        if (tipo){
            Project.fac = new FacCliente();
        }else{
            Project.fac = new FacAdm();
        }
        Home h = Project.fac.getHome();
        View vHome = new View(h.getLoad().load(),"Home");
        Configuracoes c = Project.fac.getConfig();
        View vConfig = new View(c.getLoad().load(),"Config");
        this.add(vHome);
        this.add(vConfig);
    }
    
    public Scene getAtualCena(String tipo){
        Scene c = null;
        for(Observador ob: this.observadores){
            if(this.viewAtual.equals(ob.getTipo())){
                c = (Scene) ob;
            }
        }
        return c;
    }
    @Override
    public void start(Stage stage) throws Exception {
        initOne();
        
        stage.setScene(getAtualCena(viewAtual));
        
        stage.show();
    }
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
