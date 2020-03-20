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
    
    
       public Nodo getInicio() 
    {
        return Inicio;
    }
    
    
     private void CrearLista(int Priori, int Id,String DirecM, int tiempo , String hora, int correlativo)
    {
        Nodo nuevo = new Nodo(Priori);
        nuevo.setPrioridad(Priori);
        nuevo.setID(Id);
        nuevo.setDirecM(DirecM);
        nuevo.setTiempo(tiempo);
        nuevo.setTiempoRe(tiempo);
        nuevo.setHora(hora);
        nuevo.terminado=false;
        nuevo.setCorrelativo(correlativo);
        
       // nuevo.setsiguiente(null);
       nuevo.setsiguiente(nuevo);

       Inicio = Final = nuevo;
       
        //Final.setsiguiente(Inicio);
        Tam++;
    }
     
     
 
    
     private void InsertarF(int Priori, int Id,String DirecM, int tiempo , String hora, int correlativo)
    {
        Nodo nuevo = new Nodo(Priori);
        nuevo.setPrioridad(Priori);
        nuevo.setID(Id);
        nuevo.setDirecM(DirecM);
        nuevo.setTiempo(tiempo);
        nuevo.setTiempoRe(tiempo);
        nuevo.setHora(hora);
        nuevo.terminado=false;
        nuevo.setCorrelativo(correlativo);
        
        nuevo.setsiguiente(Inicio);
        Final.setsiguiente(nuevo);
        Final = nuevo;
        
        Tam++;
    }
//     
//      private void InsertarI(int Priori, String Id, int tiempo , String hora)
//    {
//        Nodo nuevo = new Nodo(Priori);
//        nuevo.setPrioridad(Priori);
//        nuevo.setID(Id);
//        nuevo.setTiempo(tiempo);
//        nuevo.setTiempoRe(tiempo);
//        nuevo.setHora(hora);
//        
//        
//        nuevo.setsiguiente(Inicio);
//        Inicio.siguiente= nuevo;
//        Inicio = nuevo;
//        Tam++;
//    }
//      

         
      public void InsertarP(int Priori, int Id,String DirecM, int tiempo , String hora, int correlativo)
      {
            if(Tam==0)
            {
            this.CrearLista(Priori,Id, DirecM, tiempo, hora, correlativo);
            }

//            else if(Priori==Inicio.Prioridad)
//            {
//                this.InsertarI(Priori,Id, tiempo, hora);
//            }
              else //if(Priori==Final.Prioridad)
            {
                this.InsertarF(Priori,Id,DirecM, tiempo, hora, correlativo);
            }
      
      }
    
//      private void BorrarI(int dato)
//      {
//          Nodo temp=new Nodo(dato);
//          temp=Inicio;
//          Inicio=Inicio.siguiente;
//          temp=null;
//          Tam--;        
//      }
      
//      private void BorrarF(int dato)
//      {
//        Nodo temp=new Nodo(0);
//        temp=Inicio;
//
//            while(temp.siguiente!=Final)
//                {
//                temp = temp.siguiente;
//                }
//            
//        Final=null;
//        temp.siguiente=null;
//        Final=temp;
//        Tam--;
//      }


      

      
//      public void BorrarP(int Priori)
//      {
//            if(Priori==Inicio.Prioridad)
//            {
//                this.BorrarI(Priori);
//            }
//            else 
//            {
//            this.BorrarF(Priori);
//                System.out.println("DATO FINAL  " + Final.Prioridad);
//            } 
//      }
      
     //--------------------------------------------------------------------------------- 
//    public void Recorrer(int Priori)
//    {
//        Nodo temp = new Nodo(Priori);
//        temp=Inicio;
//        while(temp!=null)
//           {
////               System.out.println("Prioridad " +temp.Prioridad+ 
////                       " Id "+ temp.ID+" Tiempo " + temp.Tiempo + " Hora : " + temp.Hora + "TiempoRE: " + temp.TiempoRe);   
//              if (temp.siguiente==null) {
//                  
//               System.out.println(" ID " +  temp.ID + " Siguiente nulo");
//           }
//           else
//           {
//           System.out.println(" ID "+temp.ID+ " "+"Nodo Siguiente "+ temp.siguiente.getID());
//           temp = temp.siguiente;
//           }
//               
//
//               
//               try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException ex) {
//                   System.out.println("error"+ex);
//                }
//           }
//    }
     
    
}
