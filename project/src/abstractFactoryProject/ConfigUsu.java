/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author Joao Santos
 */
public class ConfigUsu implements Configuracoes{
    public FXMLLoader loader;
    
    
    
    public ConfigUsu() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("HomeAdm.fxml"));
        this.loader=loade;
    }
    
    @Override
    public void clickHome() {
        
    }

    @Override
    public void clickEdite() {
 
    }

    @Override
    public void clickSair() {
        
    }

    @Override
    public void clickSalvar() {
       
    }

    @Override
    public void clickCancel() {
        
    }

    @Override
    public FXMLLoader getLoad() {
        return this.loader;
    }
    
}
