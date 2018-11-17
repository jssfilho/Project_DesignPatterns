/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import bridgeProject.Produto;
import java.util.ArrayList;
import observerProject.Cliente;
import observerProject.Fornecedor;

/**
 *
 * @author Joao Santos
 */
public class Pedido {
    private Cliente comprador;
    private Fornecedor vendedor;
    private ArrayList<Produto> carrinho;

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Fornecedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Fornecedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }
    
    
    
}
