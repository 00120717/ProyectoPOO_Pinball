/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MMont
 */
public class JuegoDao {
   
    Conexion con = Conexion.Connectar();
    
    Statement ps;

    public JuegoDao() {
       con = Conexion.Connectar();
       
    }
    
    public boolean insert() {
         Connection con2 = null;
                             
        try {
            con2= this.con.getCon();
            ps = this.con.getCon().prepareStatement("Insert Into juego (fecha) Values (Now())");
            
            ps.executeUpdate("Insert Into juego (fecha) Values (Now())");
            
            return true;
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
               
            
        }
        return false;
    }

    
    
}
