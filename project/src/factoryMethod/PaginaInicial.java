/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


/**
 *
 * @author Joao Santos
 */
public interface PaginaInicial {
    public void cadastrar(ActionEvent event);
    public FXMLLoader getParent();
}
