/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import java.util.Date;

/**
 *
 * @author GuillePC
 */

public class Nodo 
{
     public Nodo siguiente;
     int Prioridad;
     String ID;
     int Tiempo;
     int TiempoRe;
     String Hora;
     boolean terminado = false;
       

     
      public void Nodo()
    {
        Prioridad=0;
        ID = "";
        Tiempo=0;
        TiempoRe=0;
        terminado = false;
       // Hora = new SimpleDateFormat("HH:mm:ss");
        
        siguiente= null;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
           
    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }
    

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getTiempoRe() {
        return TiempoRe;
    }

    public void setTiempoRe(int TiempoRe) {
        this.TiempoRe = TiempoRe;
    }
     
     

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    public Nodo(int Prioridad)
            {
             this.Prioridad = Prioridad;
             siguiente = null;
             
            }
    
       
   
    
    void setsiguiente(Nodo Siguiente)
    {
      siguiente= Siguiente;
    }
    
    Nodo getsiguiente()
    {
        return siguiente;
    }
    
    
}