
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
    public Produto getProduto(String codBarra) {
        
        Produto p = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        try {
            stmt = this.con.prepareStatement("SELECT * FROM produto.roupa WHERE codBarra=?");
            stmt.setString(1, codBarra);
            stmt2 = this.con.prepareStatement("SELECT * FROM produto.eletro WHERE codBarra=?");
            stmt2.setString(1, codBarra);
            stmt3 = this.con.prepareStatement("SELECT * FROM produto.roupa WHERE codBarra=?");
            stmt3.setString(1, codBarra);
            rs = stmt.executeQuery();
            rs2 = stmt2.executeQuery();
            rs3 = stmt3.executeQuery();
            if(rs.next()){
                //tamanho, codbarra,preco, nome, descricao
                Vestimenta v = new Vestimenta(rs.getString("tamanho"),rs.getString("codBarra"),rs.getFloat("preco"),rs.getString("nome"),rs.getString("descricao"));
                p=v;
            }else if(rs2.next()){
                Eletronico e = new Eletronico(rs2.getString("garantia"),rs2.getString("codBarra"),rs2.getFloat("preco"),rs2.getString("nome"),rs2.getString("descricao"));
                p=e;
            }else if(rs3.next()){
                Alimento a = new Alimento(rs3.getString("codBarra"),rs3.getFloat("preco"),rs3.getString("nome"),rs3.getString("descricao"));
                p=a;
            }else{
                System.out.println("Produto não existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
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
    public void removeProd(String codBarra) throws SQLException{
        try {
            PreparedStatement stmt = null;
            PreparedStatement stmt2 = null;
            PreparedStatement stmt3 = null;
            ResultSet rs = null;
            ResultSet rs2 = null;
            ResultSet rs3 = null;
            stmt = this.con.prepareStatement("SELECT * FROM produto.roupa WHERE codBarra=?");
            stmt.setString(1, codBarra);
            stmt2 = this.con.prepareStatement("SELECT * FROM produto.eletro WHERE codBarra=?");
            stmt2.setString(1, codBarra);
            stmt3 = this.con.prepareStatement("SELECT * FROM produto.roupa WHERE codBarra=?");
            stmt3.setString(1, codBarra);
            rs = stmt.executeQuery();
            rs2 = stmt2.executeQuery();
            rs3 = stmt3.executeQuery();
            if(rs.next()){
              stmt = this.con.prepareStatement("DELETE FROM produto.roupa WHERE codBarra=?");
              stmt.setString(1,codBarra);
            }else if(rs2.next()){
                
                stmt2 = this.con.prepareStatement("DELETE FROM produto.eletro WHERE codBarra=?");
                stmt2.setString(1, codBarra);
            }else if(rs3.next()){
                stmt3 = this.con.prepareStatement("DELETE FROM produto.alimento WHERE codBarra=?");
                stmt3.setString(1, codBarra);
            }else{
                System.out.println("Produto não existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
