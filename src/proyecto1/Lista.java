    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import proyecto1.Nodo;

/**
 *
 * @author GuillePC
 */
public class Lista {
    
    private Nodo Inicio;
    private Nodo Final;
    int Tam=0;
    
     private void CrearLista(int Priori, String Id, int tiempo , String hora)
    {
        Nodo nuevo = new Nodo(Priori);
        nuevo.setPrioridad(Priori);
        nuevo.setID(Id);
        nuevo.setTiempo(tiempo);
        nuevo.setTiempoRe(tiempo);
        nuevo.setHora(hora);
        
        nuevo.setsiguiente(null);
        Inicio = Final = nuevo;
        Tam++;
    }
     
     private void InsertarF(int Priori, String Id, int tiempo , String hora)
    {
        Nodo nuevo = new Nodo(Priori);
        nuevo.setPrioridad(Priori);
        nuevo.setID(Id);
        nuevo.setTiempo(tiempo);
        nuevo.setTiempoRe(tiempo);
        nuevo.setHora(hora);
        nuevo.setsiguiente(null);
        Final.setsiguiente(nuevo);
        Final = nuevo;
        Tam++;
    }
     
      private void InsertarI(int Priori, String Id, int tiempo , String hora)
    {
        Nodo nuevo = new Nodo(Priori);
        nuevo.setPrioridad(Priori);
        nuevo.setID(Id);
        nuevo.setTiempo(tiempo);
        nuevo.setTiempoRe(tiempo);
        nuevo.setHora(hora);
        nuevo.setsiguiente(Inicio);
        Inicio = nuevo;
        Tam++;
    }
      

         
      public void InsertarP(int Priori, String Id, int tiempo , String hora)
      {
            if(Tam==0)
            {
            this.CrearLista(Priori,Id, tiempo, hora);
            }

            else if(Priori<=Inicio.Prioridad)
            {
                this.InsertarI(Priori,Id, tiempo, hora);
            }
              else if(Priori>=Final.Prioridad)
            {
                this.InsertarF(Priori,Id, tiempo, hora);
            }
      
      }
    
      private void BorrarI(int dato)
      {
          Nodo temp=new Nodo(dato);
          temp=Inicio;
          Inicio=Inicio.siguiente;
          temp=null;
          Tam--;        
      }
      
      private void BorrarF(int dato)
      {
        Nodo temp=new Nodo(0);
        temp=Inicio;

            while(temp.siguiente!=Final)
                {
                temp = temp.siguiente;
                }
            
        Final=null;
        temp.siguiente=null;
        Final=temp;
        Tam--;
      }

    public Nodo getInicio() {
        return Inicio;
    }
      

      
      public void BorrarP(int Priori)
      {
            if(Priori==Inicio.Prioridad)
            {
                this.BorrarI(Priori);
            }
            else 
            {
            this.BorrarF(Priori);
                System.out.println("DATO FINAL  " + Final.Prioridad);
            } 
      }
      
      
    public void Recorrer(int Priori)
    {
        Nodo temp = new Nodo(Priori);
        temp=Inicio;
        while(temp!=null)
           {
               System.out.println("Prioridad " +temp.Prioridad+ 
                       " Id "+ temp.ID+" Tiempo " + temp.Tiempo + " Hora : " + temp.Hora + "TiempoRE: " + temp.TiempoRe);   
               temp=temp.siguiente;
           }
    }
     
    
}
