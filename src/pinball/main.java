/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinball;

import Dao.JuegoDao;
import Dao.JuegoXJugadorDAO;
import Dao.JugadorDao;
import Modelo.Jugador;
import Scenes.MainScreen;
import Scenes.TopChart;
import static java.awt.image.ImageObserver.ABORT;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class main{
        public static JFrame frame;
        
    public static void main(String[] args){
        JFrame main = new MainScreen();
        main.setVisible(true);
        
        frame = new JFrame();

        frame.setSize(800,650);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

        Pinball panel = new Pinball();
        
        frame.add(panel);
          
            while(panel.getLives()>0){
              //frame.setVisible(true);
          }
        
          
          if(panel.getLives()<=0){
              Jugador j = new Jugador();
              j.setPuntos(panel.getPoints());
              j.setName(MainScreen.txt1.getText());
              
              
              JuegoDao jd2 = new JuegoDao();
              jd2.insert();
              
              
              JugadorDao jd = new JugadorDao();
              jd.insert(j);

              
              JuegoXJugadorDAO jjd = new JuegoXJugadorDAO();
             jjd.insert(jjd.getLastJugador(), jjd.getLastJuego());
             
             frame.setVisible(false);
              
             
             
              JFrame second = null;
            try {
                second = new TopChart();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
              second.setVisible(true);
              
              //System.exit(ABORT);
            } 
     
    
    
    }

}