/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import bridgeProject.*;
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
public class FacadeProject {
    private Connection con=null;

    public FacadeProject() throws ClassNotFoundException {
        this.con = SingletonConnection.getConnection();
    }
   
    public Usuario loginMet(String id, String senha) throws ClassNotFoundException{
        Connection con = SingletonConnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario u=null;
        try {

            stmt = con.prepareStatement("SELECT * FROM usuario.cliente WHERE email = ? and senha = ?");
            stmt.setString(1, id);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next() && rs.getInt("codStory")==0) {
                u = new Cliente();
                u.setTipo(false);
                u.setCpf(""+rs.getInt("cpf"));
                u.setEmail(rs.getString("email"));
                u.setNome(rs.getString("nome"));
                u.setBairro(rs.getString("bairro"));
                u.setRua(rs.getString("rua"));
                u.setNum(rs.getInt("numero"));
                u.setSenha(rs.getString("senha"));
            }else if(rs.next() && rs.getInt("codStory")!=0){
                
                Fornecedor d = new Fornecedor();
                d.setTipo(true);
                d.setCpf(""+rs.getInt("cpf"));
                d.setEmail(rs.getString("email"));
                d.setNome(rs.getString("nome"));
                d.setBairro(rs.getString("bairro"));
                d.setRua(rs.getString("rua"));
                d.setNum(rs.getInt("numero"));
                d.setSenha(rs.getString("senha"));
                d.setCodMyStore(""+rs.getInt("codStory"));
                u = d;
            }else{
                System.out.println("Login FALHOU");
            }

        } catch (SQLException ex) {
            Logger.getLogger(FacadeProject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            SingletonConnection.closeConnection(con, stmt, rs);
        }
        return u;
    }

   
    public void cadastrar(String senha,String nome, String email, int Cpf, String bairro, String rua, int num, String loja,int Cnpj) throws ClassNotFoundException, SQLException{
        Connection con = SingletonConnection.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario.cliente (senha, nome, email, cpf, bairro, rua, numero,codStory)"
                    + "VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1,senha);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setInt(4, Cpf);
            stmt.setString(5, bairro);
            stmt.setString(6, rua);
            stmt.setInt(7, num);
            stmt.setInt(8, Cnpj);

            stmt.executeUpdate();

            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            SingletonConnection.closeConnection(con, stmt);
        }
    }
   
    public void createProduto(String cod, float preco, String nome, String descricao, String opcao){
        
    }
    public Produto getProd(String cod, String tipo){
        
        return null;
    }
    
}
