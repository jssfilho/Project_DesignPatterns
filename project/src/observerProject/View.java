/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;
import bridgeProject.UsuarioSujeito;
import abstractFactoryProject.*;

import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Joao Santos
 */
public class View extends Scene implements Observador{
    private Project p;
    private UsuarioSujeito ob = null;
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

    public UsuarioSujeito getOb() {
        return ob;
    }

    public void setOb(UsuarioSujeito ob) {
        this.ob = ob;
    }
}
