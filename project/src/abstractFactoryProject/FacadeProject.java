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
                u.setCpf(id);
                u.setEmail(id);
                u.setNome("");
                u.setBairro(id);
                u.setRua(id);
                u.setNum(0);
                u.setSenha(senha);
            }else if(rs.next() && rs.getInt("codStory")!=0){
                u = new Fornecedor();
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

    
    /*
    public Usuario uG(String nome, String senha){
        Usuario c = new Cliente();
        c.setEmail("j_ssfilho@hotmail.com");
        c.setSenha("1234");
        c.setTipo(false);
  
        Usuario f = new Fornecedor();
        f.setTipo(true);
        f.setEmail("joao.santos@academico.ifpb.edu.br");
        f.setSenha("1234");
        
        Usuario u = null;
        if(c.getEmail().equals(nome) && c.getSenha().equals(senha)){
            u = c;
        }else if(f.getEmail().equals(nome) && f.getSenha().equals(senha)){
            u = f;
        }else{
            System.out.println("Usuario não encontrado");
        }
        
        return u;
    }
    */
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
   
}
