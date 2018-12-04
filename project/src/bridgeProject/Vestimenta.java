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
public class Vestimenta extends Produto{
    private String tamanho;

    public Vestimenta(String tamanho, String codBarra, float preco, String nome, String descricao) {
        super(codBarra, preco, nome, descricao);
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
}

