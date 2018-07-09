/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenes;

import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pinball.main;
/**
 *
 * @author MMont
 */
public class MainScreen extends JFrame {
    public JLabel lbl1, lbl2;
    public static JTextField txt1;
    public JButton btn1;

    public MainScreen() {
        ImageIcon ii = new ImageIcon(getClass().getResource("logo.png"));
        ImageIcon ii2 = new ImageIcon(ii.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        lbl2 = new JLabel(ii2);
        //lbl2.setIcon(ii);
        lbl2.setBounds(150, 10, 300, 300);
        
       lbl1 = new JLabel("Ingrese su Nombre");
       lbl1.setBounds(250,275,200,100);
       
       txt1 = new JTextField("");
       txt1.setBounds(175,350,250,25);
       
       btn1 = new JButton("Jugar");
       btn1.setBounds(250, 400, 100, 25);
       
       btn1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
             if(txt1.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Ingrese Un Nombre Valido");
             }else{
                 setVisible(false);
                 main.frame.setVisible(true);
             }
           }
       
       });
       
       
       Container container = getContentPane();
       container.add(lbl1);
       container.add(btn1);
       container.add(txt1);
       container.add(lbl2);
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600,600);
    }
    
    public static void main(String[] args){
       java.awt.EventQueue.invokeLater(new Runnable(){
           @Override
           public void run() {
           
           new MainScreen().setVisible(true);
           }
       
       });
    }
    
    
    
}
