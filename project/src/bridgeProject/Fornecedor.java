/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

import abstractFactoryProject.Loja;
/**
 *
 * @author Joao Santos
 */
public class Fornecedor extends Usuario{
    private Loja myStore;
    private String codMyStore;

    public Loja getMyStore() {
        return myStore;
    }

    public void setMyStore(Loja myStore) {
        this.myStore = myStore;
    }

    public String getCodMyStore() {
        return codMyStore;
    }

    public void setCodMyStore(String codMyStore) {
        this.codMyStore = codMyStore;
    }
    
}
