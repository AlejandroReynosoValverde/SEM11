/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionSql {



    public static ConexionSql getConexion() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        String url="jdbc:mysql://localhost:3306/GOTTOLAND";
        String user="root";
        String pass="";
        Connection con;
    public Connection getConnection(){
    try {
//Para hacer la conexión
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        System.out.println("Conexión satisfecha");

    }catch (Exception e) {
        System.out.println("ERES KABRO");
    }
    return con;


    }
}
