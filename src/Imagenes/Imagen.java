/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Marvin Ramirez
 */
public class Imagen extends javax.swing.JPanel{
    public Imagen() {
    this.setSize(300, 400); //se selecciona el tamaño del panel
    }

    //Se crea un método cuyo parámetro debe ser un objeto Graphics

    public void paint(Graphics grafico) {

    //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

    ImageIcon Img = new ImageIcon(getClass().getResource("sol.png")); 
    ImageIcon Img2 = new ImageIcon(getClass().getResource("planet2.png")); 
    ImageIcon Img3 = new ImageIcon(getClass().getResource("planet3.png"));
    ImageIcon Img4 = new ImageIcon(getClass().getResource("Luna.png"));
    ImageIcon Img5 = new ImageIcon(getClass().getResource("planeta6.png"));
    ImageIcon Img6 = new ImageIcon(getClass().getResource("planet5.png"));
    ImageIcon Img7 = new ImageIcon(getClass().getResource("inferior.png"));
    ImageIcon Img8 = new ImageIcon(getClass().getResource("inferiorD.png"));
    ImageIcon Img9 = new ImageIcon(getClass().getResource("barra.png"));
    ImageIcon Img10 = new ImageIcon(getClass().getResource("logo.png"));
    
    //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

    grafico.drawImage(Img.getImage(), 30, 30, 105, 105, null);
    grafico.drawImage(Img2.getImage(), 15, 365, 70, 70, null);
    grafico.drawImage(Img3.getImage(), 200, 250, 60, 60, null);
    grafico.drawImage(Img4.getImage(), 375,175 , 50, 50, null);
    grafico.drawImage(Img5.getImage(), 220,70 , 60, 60, null);
    grafico.drawImage(Img6.getImage(), 465,365 , 70, 70, null);
    grafico.drawImage(Img7.getImage(), 0, 550, 190, 70, null);
    grafico.drawImage(Img8.getImage(), 370, 550, 230, 70, null);
    grafico.drawImage(Img9.getImage(), 600, 0, 20, 800, null);
    grafico.drawImage(Img10.getImage(), 550, 0, 300, 200, null);
    
    setOpaque(false);
    super.paintComponent(grafico);
    }

}
