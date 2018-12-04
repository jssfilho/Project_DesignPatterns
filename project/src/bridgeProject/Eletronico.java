/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

/**
 *
 * @author Joao Santos
 */
public class Eletronico extends Produto{
    private String garantia;

    public Eletronico(String garantia, String codBarra, float preco, String nome, String descricao) {
        super(codBarra, preco, nome, descricao);
        this.garantia = garantia;
    }
    
    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}
