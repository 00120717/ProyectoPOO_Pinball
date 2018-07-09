/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenes;

import Dao.JugadorDao;
import Modelo.Jugador;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MMont
 */
public class TopChart extends JFrame{
    
        
    ButtonGroup existencia = new ButtonGroup();
    public JTable resultados = new JTable();
    
    public JPanel table = new JPanel();
    
    private static final int ANCHOC=130,ALTOC=30;
    
    DefaultTableModel tm = new DefaultTableModel();

    public TopChart() throws SQLException {
        super("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Container container = getContentPane();
        container.add(table);
        setSize(600,600);
        
        table.setBounds( 10,10,500,300 );
        table.add(new JScrollPane(resultados));
        
        
        
        tm = new DefaultTableModel(){
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    default:
                        return String.class;
                        
                        
                }
            }
        };
        
        tm.addColumn("Nombre");
        tm.addColumn("Puntaje");
        tm.addColumn("Fecha");
        
        JugadorDao jd = new JugadorDao();
        ResultSet rs = jd.findTop();
        
        while(rs.next()){
            try {
                tm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            } catch (SQLException ex) {
                Logger.getLogger(TopChart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
        resultados.setModel(tm);
    }
    
    
    
}
