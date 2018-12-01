/*
 * To change this license header, choose License Headers in SujeitoConcreto Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;
import bridgeProject.UsuarioSujeito;
import abstractFactoryProject.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Joao Santos
 */
public class View extends Scene implements Observador{
    public SujeitoConcreto p;
    private String tipo;
    private boolean on;
    /*
        Definir os dados observados
    */
    
    @Override
    public String getTipo() {
        return tipo;
    }

    public View(Parent root, String tipo) {
        super(root);
        this.tipo = tipo;
    }
    
    
    
    @Override
    public void update() {
        if(this.tipo.equals(p.viewAtual)){
            this.on=true;
        }else{
            this.on=false;
        }
    }
  
}
