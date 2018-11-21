/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;
import javafx.scene.Parent;

import observerProject.View;
import observerProject.Cliente;
import observerProject.Fornecedor;

/**
 *
 * @author Joao Santos
 */
public abstract class Factory {
     public abstract Parent getConfig();
     public abstract Parent getHome();
}
