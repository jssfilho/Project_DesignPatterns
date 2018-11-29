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


/**
 *
 * @author assert
 */
public class SingletonConetion {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/dbProject";
    private final String USER = "root";
    private final String PASS = "";
    public Connection getConnection() throws ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            return  DriverManager.getConnection(URL, USER, PASS);
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
}
    

