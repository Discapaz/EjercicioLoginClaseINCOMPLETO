/*

 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joan
 */
public class Conexion {
    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto";
    private static final String USER = "root";
    private static final String PASS = "root"; 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER,PASS);
        }catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    public void desconectar() throws Exception {
        try {
           if(con!=null){
               if(con.isClosed()==false){
                   con.isClosed();
               }
           } 
        } catch (SQLException e) {
            throw e;
        }
    }        
}
