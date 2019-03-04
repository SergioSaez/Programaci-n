/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sergio
 */
public class DbConnection {
    
    private String bd = "t9ej2";
    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost:3307/"+bd;
    private Connection connection;    

public void conectar() throws Exception
    {
         Class.forName("com.mysql.jdbc.Driver");
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection==null){
            throw new Exception("Problemas con la conexión");
         }
   }  
}