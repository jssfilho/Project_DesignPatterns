/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import javafx.scene.Parent;

/**
 *
 * @author Joao Santos
 */
public interface Configuracoes {
    public Parent getLoad();
    public void clickHome();
    public void clickEdite();
    public void clickSair();
    public void clickSalvar();
    public void clickCancel();
}
