
package cla1;

import java.util.Random;

    import java.util.Random;



public class Montecarlos extends Thread {
//contructor de la clase
    public Montecarlos(Random gen,long ct) {
        generador = gen;
        cantidadTotal = ct;
    }
    
    //metodo para saber si los puntos estan dentro del circulo
    private double distancia(double x,double y){
        return Math.sqrt(x*x+y*y);
    }
    //cantidad de los que cayeron dentro
    public long getCantidadDentro() {
        return cantidadDentro;
    }

    public void setCantidadDentro(long cantidadDentro) {
        this.cantidadDentro = cantidadDentro;
    }

    public long getCantidadTotal() {
        return cantidadTotal;
    }
    //sobreescrimos metodo
    @Override
    public void run() {
        //desde i hasta la cantidad de hilos
        for (long i = 0; i < cantidadTotal; i++) {
            double x = generador.nextDouble();
            double y = generador.nextDouble();
            //si el metodo es menor  uno aumentamos ya que cayo dentro del circulo
            if (distancia(x, y) <= 1) {
                cantidadDentro++;
            }
        }
    }
    //atributo de numeros dentro
    private long cantidadDentro = 0;
    //cantidad total de puntos
    private long cantidadTotal = 0;
    //generador de numeros ramdom
    private Random generador = null;
}

