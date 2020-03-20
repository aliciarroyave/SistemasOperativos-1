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
     int ID;
     String DirecM;
     int Tiempo;
     int TiempoRe;
     String Hora;
     boolean terminado = false;
     int correlativo;
       

     
      public void Nodo()
    {
        Prioridad=0;
        ID = 0;
        DirecM="";
        Tiempo=0;
        TiempoRe=0;
        terminado = false;
        correlativo=0;
      
        
        siguiente= null;
    }

    public String getDirecM() {
        return DirecM;
    }

    public void setDirecM(String DirecM) {
        this.DirecM = DirecM;
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
     
     

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    public Nodo(int Prioridad)
            {
             this.Prioridad = Prioridad;
            }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
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