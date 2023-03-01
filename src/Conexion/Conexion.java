/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lo397
 */
public class Conexion {

    public static Connection getConexion() {

        String conexionUrl = "jdbc:sqlserver://DESKTOP-3353KTR:1433;"
                + "database=AdventureWorksLT2019;"
                + "user=LuisAntonio;"
                + "password=12345;"
                + "loginTimeout=35;";

        try {

            Connection con = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexion Exitosa");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

}
