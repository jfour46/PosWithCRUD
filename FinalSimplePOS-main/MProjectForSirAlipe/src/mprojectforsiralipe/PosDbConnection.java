
package mprojectforsiralipe;


import java.io.File;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;


public class PosDbConnection {
    static Connection con = null;
    

    public static Connection connectDb(){
       try {
            String drive = "com.mysql.cj.jdbc.Driver";
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false","root","jeff12345");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PosDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PosDbConnection.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       return con;
      
    }
    public static Connection getConnection(){
        try
        {
            if(con == null || con.isClosed()){
                con = connectDb();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return con;
    }
 
}
