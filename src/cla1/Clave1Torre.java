package cla1;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;


import java.util.Scanner;

/**
 *
 * @author Christopher Lysander Cruz Martinez CM17066
 */
public class Clave1Torre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Scanner
        Scanner pl=new Scanner(System.in);
       //instancia de lo datos de la clase
          Variables n1= Variables.getInstance(0,0,0);
       
        do{  
            //menu a mostrar en pantalla
            menu.Menu();
            System.out.println("Ingrese una opcion");
            n1.setOpcion(pl.nextInt());//leer opcion de menu
            switch(n1.getOpcion())//menu
            {
                //case 1 para torre de hanoi
                case 1:
                    System.out.println("ingrese la cantidad de discos");
                    n1.setN(pl.nextInt());
                    System.out.println(n1.getN());
                    //instancia de la clase
                    Hanoi s;
                    s=new Hanoi();
                    //resultado
                    s.Hanoi(n1.getN(), 1, 2, 3);
                    break;
                    //simulacion forma de jugar torre de hanoi
                case 2:
                    Simulacion sim = new Simulacion(5, (int) 1e6); //hilos y numero de ceros
                    System.out.println(sim.pi()); 
                    break; 
                    //calcular valor de pi por metodo de montecarlo
                case 3:
                    //instancia de la clase
                    canhanoi ss=new  canhanoi();
                    ss.Ima();
                    break;
            }
            System.out.println("Desea realizar otra operacion 1-si 2-no");
            n1.setRe(pl.nextInt());
        }while(n1.getRe()!=2);//repetir
    }
    
}
