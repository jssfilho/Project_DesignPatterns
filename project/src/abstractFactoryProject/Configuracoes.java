/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author Joao Santos
 */
public interface Configuracoes {
    public FXMLLoader getLoad();
    public void clickHome(ActionEvent event);
    public void clickEdite(ActionEvent event);
    public void clickSair(ActionEvent event);
    public void clickSalvar(ActionEvent event);
    public void clickCancel(ActionEvent event);
}
