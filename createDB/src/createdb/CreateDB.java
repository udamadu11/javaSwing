/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdb;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class CreateDB {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/stuDB";
        String uname = "root";
        String pass = "";
        String query = "SELECT * FROM user";
 
            Connection conn;
        
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url,uname,pass);
            }
            catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
            }
    }
}
