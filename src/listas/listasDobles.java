
package listas;

import java.util.Scanner;


public class listasDobles {
    Scanner teclado = new Scanner (System.in);
    nodo primero;
    nodo ultimo;
    
    public listasDobles (){
        primero = null;
        ultimo = null;
    }
    
    
    public void ingresarNodo (int dato){
        nodo nuevo = new nodo();
        nuevo.dato = dato;
        
        if (primero == null){
            primero = nuevo;
            primero.siguiente = null;
            primero.anterior = null; 
            ultimo = primero;
        } else {
                ultimo.siguiente = nuevo;
                nuevo.anterior = ultimo;
                nuevo.siguiente = null;
                ultimo = nuevo;
        }
    }
    
    
    

    
    public void buscarNodo (int dato){
        nodo actual = new nodo();
        actual = primero;
            while (actual!=null){
        
          if (actual.dato==dato){
        
              System.out.println(" Nodo encontrado: Si existe en la lista");  
            } else {System.out.println("No existe dato en la lista");}
       
        actual = actual.siguiente;
    
        } 
            
    }
    
    
    public void modificarNodo (int dato){
            nodo actual = new nodo();
                actual = primero;
                while (actual!=null) {
                          if (actual.dato==dato){
                                System.out.println(" Ingrese el nuevo dato para este nodo: ");
                              actual.dato = teclado.nextInt();
                            }
       
             actual = actual.siguiente;
         
         }
    }
    
    
    public void eliminarNodo (int dato){
            nodo actual = new nodo();
            actual = primero;
            nodo anterior = new nodo ();
            anterior = null;
            boolean encontrado = false;
            System.out.println(" Ingrese el dato del nodo a eliminar");
            int nodoBuscado = teclado.nextInt();
            
            
                    
        if (primero != null) {
                    while (actual != null && encontrado != true){
                     if (actual.dato == nodoBuscado){
                     if (actual == primero){
                        primero = primero.siguiente;
                        }  else if (actual == ultimo){
                           anterior.siguiente = null;
                            ultimo = anterior;
                                           
                     } else {
                          anterior.siguiente = actual.siguiente;
                     }
                     
                     System.out.println("\n Nodo eliminado\n");
                     encontrado = true;
                }
                
                anterior = actual; 
                actual = actual.siguiente;
            
            }
            
            if (encontrado){
               System.out.println("\n Nodo no encontrado\n");
            
            }
        
                } else {
        
            System.out.println("\n La lista se encuentra vacia\n");
        
        }
        
    }
    
    
    public void desplegarListaAlreves (){
           nodo puntero = new nodo();
           puntero = ultimo;
           System.out.println("Datos alreves");
           while (puntero!= null){
                 
                 System.out.println(puntero.dato);
                 puntero = puntero.anterior;
           }
    } 
    
    
        public void desplegarListaAlderecho (){
           nodo puntero = new nodo();
           puntero = primero;
           System.out.println("Datos alderecho");
           while (puntero!= null){
                 
                 System.out.println(puntero.dato);
                 puntero = puntero.siguiente;
           }     
    }
        
        
        
     
     
     
    
}
