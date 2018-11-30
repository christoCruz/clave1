/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cla1;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
/**
 *
 * @author Pricila Romero
 */

public class canhanoi {
    static int contador=0;
     public void Ima()
    {//segundos
        int velocidad =3;
        TimerTask tarea;
        int velmil = velocidad*1000;
        mostraImhanoi han=new mostraImhanoi();
        han.setVisible(true);
        tarea=new TimerTask() {
            @Override
            public void run() {
                  Icon icono; 
                  switch(contador)
                  {
                      case 0:
                          contador=1;
                            icono= new ImageIcon(getClass().getResource("/iconos/hanoi.jpg"));
                            han.t.setIcon(icono);
                            break;
                             case 1:
                          contador=2;
                            icono= new ImageIcon(getClass().getResource("/iconos/hanoi.jpg"));
                            han.t.setIcon(icono);
                            break;
                             case 2:
                          contador=3;
                            icono= new ImageIcon(getClass().getResource("/iconos/hanoi.jpg"));
                            han.t.setIcon(icono);
                           
                            
                            JOptionPane.showMessageDialog(null, "Completado!!!");
                            break; 
                            
                  }
            }

            
      
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(tarea,velmil, velmil);
    }
    
}
