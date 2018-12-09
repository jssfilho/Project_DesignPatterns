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
import observerProject.mainfx;

/**
 *
 * @author Joao Santos
 */
public class FacadeProject {
    private Connection con=null;
    private BancoProdutos fb;

    public FacadeProject() throws ClassNotFoundException {
        this.con = SingletonConnection.getConnection();
    }
   
    public Usuario loginMet(String id, String senha) throws ClassNotFoundException{
        Connection con = SingletonConnection.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs=null;
        ResultSet rs2=null;
        Usuario u=null;
        try {

            
            stmt = con.prepareStatement("SELECT * FROM usuario.fornecedor WHERE email = ? and senha = ?");
            stmt.setString(1, id);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            stmt2 = con.prepareStatement("SELECT * FROM usuario.cliente WHERE email = ? and senha = ?");
            stmt2.setString(1, id);
            stmt2.setString(2, senha);
            rs2 = stmt2.executeQuery();
            
            if (rs2.next()) {
                u = new Cliente();
                u.setTipo(false);
                u.setCpf(rs2.getString("cpf"));
                u.setEmail(rs2.getString("email"));
                u.setNome(rs2.getString("nome"));
                u.setBairro(rs2.getString("bairro"));
                u.setRua(rs2.getString("rua"));
                u.setNum(rs2.getInt("numero"));
                u.setSenha(rs2.getString("senha"));
            }else if(rs.next()){
                Fornecedor d = new Fornecedor();
                d.setTipo(true);
                d.setCpf(rs.getString("cpf"));
                d.setEmail(rs.getString("email"));
                d.setNome(rs.getString("nome"));
                d.setBairro(rs.getString("bairro"));
                d.setRua(rs.getString("rua"));
                d.setNum(rs.getInt("numero"));
                d.setSenha(rs.getString("senha"));
                d.setCodMyStore(""+rs.getString("codStory"));
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

   
    public void cadastrar(String senha,String nome, String email, String Cpf, String bairro, String rua, int num, String loja,String Cnpj) throws ClassNotFoundException, SQLException{
        Connection con = SingletonConnection.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario.fornecedor (senha, nome, email, cpf, bairro, rua, numero,codStory)"
                    + "VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1,senha);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, Cpf);
            stmt.setString(5, bairro);
            stmt.setString(6, rua);
            stmt.setInt(7, num);
            stmt.setString(8, Cnpj);

            stmt.executeUpdate();
            stmt = con.prepareStatement("INSERT INTO usuario.loja (cod, nome)"
                    + "VALUES(?,?)");
            stmt.setString(1, Cnpj);
            stmt.setString(2, loja);
            
            mainfx.OnChangeScene("Login"); 
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
    public void cadastrar(String senha,String nome, String email, String Cpf, String bairro, String rua, int num) throws ClassNotFoundException, SQLException{
        Connection con = SingletonConnection.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario.cliente (senha, nome, email, cpf, bairro, rua, numero)"
                    + "VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1,senha);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, Cpf);
            stmt.setString(5, bairro);
            stmt.setString(6, rua);
            stmt.setInt(7, num);
          
            
            stmt.execute();
            
            mainfx.OnChangeScene("Login");
            
            
         

            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
    public void createProduto(int tipo, String cod, float preco, String nome, String descricao, String opcao){
        //fb.createProduto(0, p);
    }
    public Produto getProd(String cod, int tipo){
        
        return null;
    }
    public void rmProd(){
        
    }
    
    public void editUsu(int num, String bairro, String rua, String email, String senhaN) throws ClassNotFoundException{
        Connection con = SingletonConnection.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario.cliente" +
            "SET bairro=?, numero=?, senha=?, email=?,rua=? " +
            "WHERE cpf=? ");
            stmt.setString(1,bairro);
            stmt.setInt(2, num);
            stmt.setString(3,senhaN);
            stmt.setString(4, email);
            stmt.setString(5, rua);
            stmt.setString(6, mainfx.c.u.getCpf());
            stmt.executeUpdate();
            mainfx.OnChangeScene("Home");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void editAdm(String email, String senhaN) throws ClassNotFoundException{
        Connection con = SingletonConnection.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario.cliente" +
            "SET senha=?, email=?"+
            "WHERE cpf=? ");
            stmt.setString(1,email);
            stmt.setString(2, senhaN);
            stmt.setString(3, mainfx.c.u.getCpf());
            stmt.executeUpdate();
            mainfx.OnChangeScene("Home");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
    
}
