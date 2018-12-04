/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

import java.util.Date;

/**
 *
 * @author Joao Santos
 */
public class Alimento extends Produto{
    private Date validade;

    public Alimento(String codBarra, float preco, String nome, String descricao) {
        super(codBarra, preco, nome, descricao);
    }
    
    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
}
