/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;


/*
 * Singleton
 * @author Joao Santos
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Joao Santos
 */
public class SingletonConnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/project";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection conec= null;
    public static Connection getConnection() throws ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            SingletonConnection.conec =  DriverManager.getConnection(URL, USER, PASS);
            return SingletonConnection.conec;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão ", ex);
        }
    }
    public static void closeConnection(Connection con) {
        try{
           if(con!=null){
            con.close();
            } 
        }catch (SQLException ex){
            
        }
        
    }
     public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

