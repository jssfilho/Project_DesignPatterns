/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joao Santos
 */
public class BancoProdutos implements BauProduto {

    public Connection con; 
        
    public BancoProdutos(){
        try {
            this.con = SingletonConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public Produto getProduto(int tipo, String codBarra) {
        
        Produto p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        switch(tipo){
            case 1:
            
            try {
                stmt = this.con.prepareStatement("SELECT * FROM produto.alimento WHERE codBarra=?");
                stmt.setString(1, codBarra);
                rs = stmt.executeQuery();
                p = new Alimento(rs.getString("codBarra"),rs.getFloat("preco"), rs.getString("nome"), rs.getString("descricao"));
            } catch (SQLException ex) {
                Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    
                break;
            case 2:
            
            try {
               stmt = this.con.prepareStatement("SELECT * FROM produto.eletro WHERE codBarra=?");
               stmt.setString(1, codBarra);
               rs = stmt.executeQuery();
               p = new Eletronico(rs.getString("garantia") ,rs.getString("codBarra"),rs.getFloat("preco"), rs.getString("nome"), rs.getString("descricao"));
            } catch (SQLException ex) {
                Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
       
                
                break;
            case 3:
      
            try {
                stmt = this.con.prepareStatement("SELECT * FROM produto.roupa WHERE codBarra=?");
                stmt.setString(1, codBarra);
                rs = stmt.executeQuery();
                p = new Vestimenta(rs.getString("tamanho"), rs.getString("codBarra"),rs.getFloat("preco"), rs.getString("nome"), rs.getString("descricao"));
            } catch (SQLException ex) {
                Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            default:
                System.out.println("Erro");
        }
        return p;
    }
    public void createProduto(int tipo, Produto p) throws SQLException{
        PreparedStatement stmt = null;
        switch(tipo){
            case 1:
                stmt = con.prepareStatement("INSERT INTO produto.alimento (codBarra, nome, preco, descricao)"
                    + "VALUES(?,?,?,?)");
                stmt.setString(1, p.getCodBarra());
                stmt.setString(2,p.getNome());
                stmt.setFloat(3, p.getPreco());
                stmt.setString(4,p.getDescricao());
                stmt.executeUpdate();
                break;
            case 2:
                stmt = con.prepareStatement("INSERT INTO produto.eletro (codBarra, nome, preco, descricao, garantia) VALUES(?,?,?,?,?)");
                Eletronico q= (Eletronico)p;
                stmt.setString(1, q.getCodBarra());
                stmt.setString(2,q.getNome());
                stmt.setFloat(3, q.getPreco());
                stmt.setString(4,q.getDescricao());
                stmt.setString(5, q.getGarantia());
                stmt.executeUpdate();
                break;
            case 3:
                stmt = con.prepareStatement("INSERT INTO produto.roupa (codBarra, nome, preco, descricao, tamanho) VALUES(?,?,?,?,?)");
                Vestimenta a = null;
                a = (Vestimenta) p;
                stmt.setString(1, a.getCodBarra());
                stmt.setString(2,a.getNome());
                stmt.setFloat(3, a.getPreco());
                stmt.setString(4,a.getDescricao());
                stmt.setString(5, a.getTamanho());
                stmt.executeUpdate();
                break;
            default:
                System.out.println("Erro");
        }
    }
    public void removeProd(int tipo, Produto p) throws SQLException{
        PreparedStatement stmt = null;
        switch(tipo){
            case 1:
                stmt = this.con.prepareStatement("DELETE FROM produto.alimento WHERE codBarra=?");
                stmt.setString(1, p.getCodBarra());
                break;
            case 2:
                stmt = this.con.prepareStatement("DELETE FROM produto.eletro WHERE codBarra=?");
                stmt.setString(1, p.getCodBarra());
                break;
            case 3:
                stmt = this.con.prepareStatement("DELETE FROM produto.roupa WHERE codBarra=?");
                stmt.setString(1, p.getCodBarra());
                break;
            default:
                System.out.println("Erro");
        }
    }
    
}
