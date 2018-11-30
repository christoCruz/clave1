package cla1;

public class Variables {
  private int n;
  private int opcion;
 int re;
 
    private static Variables Datos;//objeto, 
    //constructor d la clase
    private Variables(int n,int opcion,int re){
        
        this.n=n;
       this.opcion=opcion;
       this.re=re;
        
    }
//metodos set y get 
    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

   
    //validamos que no este nulo
    public static Variables getInstance(int n,int opcion,int re){
        if( Datos == null)
        {
           Datos= new Variables(n,opcion,re);
        }
        else{
            
        }
        return Datos;
    }
    
}
