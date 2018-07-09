/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MMont
 */
public class JuegoXJugadorDAO {
     Conexion con = Conexion.Connectar();
    
    PreparedStatement ps;

    public JuegoXJugadorDAO() {
       
       
    }
    
    public boolean insert(int idJugador, int idJuego) {
       // Connection con = null;
        try {
            ps = this.con.getCon().prepareStatement("Insert Into jugxjueg (idJugador,idJuego) Values (?,?)");
            ps.setInt(1, idJugador);
            ps.setInt(2, idJuego);
            
            ps.executeUpdate();
            
            return true;
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                con.cerrarConexion();
            
        }
        return false;
    }
    
    public int getLastJugador(){
        ResultSet rs;
        try {
            ps = this.con.getCon().prepareStatement("SELECT idJugador FROM jugador ORDER BY idJugador DESC LIMIT 1");

           rs = ps.executeQuery();
            
            rs.next();
            
            return rs.getInt(1);
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                con.cerrarConexion();
            
        }
        return 0;
       
     }
    
     public int getLastJuego(){
        ResultSet rs;
        try {
            ps = this.con.getCon().prepareStatement("SELECT idJuego FROM juego ORDER BY idJuego DESC LIMIT 1");
            

           rs = ps.executeQuery();
           
           rs.next();
            
            return rs.getInt(1);
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                con.cerrarConexion();
            
        }
        return 0;
       
     }
        
    }

