/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenes;

import java.awt.Container;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author MMont
 */
public class MainScreen extends JFrame {
    public JLabel lbl1;
    public JTextField txt1;

    public MainScreen() {
       lbl1 = new JLabel("Test");
       lbl1.setBounds(10,10,100,100);
       
       
       Container container = getContentPane();
       container.add(lbl1);
       
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
