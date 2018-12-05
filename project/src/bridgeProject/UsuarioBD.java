/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j_ssf
 */
public class UsuarioBD implements BauUsuario{

    private Connection con;
    
    
    public UsuarioBD(){
        try {
            this.con = SingletonConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void getDados(String cod) {
        
    }
    
    public void atualizaDados(Usuario u, String senhaNv) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("UPDATE usuario.cliente  SET senha=? WHERE cpf=?");
        stmt.setString(1,senhaNv);
        stmt.setString(2, u.cpf);
        stmt.executeUpdate();
    }
    
}
