/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinball;

import static java.awt.image.ImageObserver.ABORT;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class main
{
public static void main(String[] args)
{

JFrame frame = new JFrame();


frame.setSize(800,650);
frame.setResizable(false);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


Pinball panel = new Pinball();
   

frame.add(panel);
  while(panel.getLives()>0){
      frame.setVisible(true);
  }
  if(panel.getLives()==0){
		System.exit(ABORT);
    } 
    }

}