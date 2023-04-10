/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author glesi
 */
public class Conexion {
    
    public Connection getConnection(){
        Connection connection =null;
        try {
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if(connection != null){
                System.out.println("conexion exitosa");
            }
            return connection;
        } catch (SQLException e) {
            System.out.println(e);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
}
