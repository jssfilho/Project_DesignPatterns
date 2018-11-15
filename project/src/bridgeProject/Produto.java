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
public abstract class Produto {
    /* 
    * preço expresso em reais
    * nome do produto contendo sua marca/fabricante
    * descrição do produto contendo seu tipo: bebida alcolica, carne, etc
    */
    private String codBarra;
    private float preco;
    private String nome;
    private String descricao;
    private String lote;
    private Date dCompra;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
