/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasmafernanda;

/*
 * Clase que tiene los métodos de la lista doble
*/
class ListaDoble {
    public NodoDoble PrimerNodo;
    public NodoDoble UltimoNodo;
    public int LargoLista;
    public NodoDoble dato;
       
    
    //Constructor Vacío
    public ListaDoble()
    {
        PrimerNodo = null;
    }
    
    //Imprime toda la lista
    public void ImprimirListaDoble()
    {
        if(PrimerNodo == null)
        {
            System.out.println("La lista está vacía");
        }
        else
        {
            NodoDoble tmp = PrimerNodo;
            while(tmp!=null)
            {
                System.out.println(tmp.Dato);
                tmp = tmp.Siguiente;
            }
        }
    }
    
    //Agrega un nodo al inicio de la lista
    public void AgregarNodoInicio(Object dato)
    {
        if(PrimerNodo == null)
        {
            PrimerNodo = new NodoDoble(dato);
        }
        else
        {
            NodoDoble tmp = new NodoDoble(dato);
            tmp.Siguiente = PrimerNodo;
            PrimerNodo.Anterior = tmp;
            PrimerNodo = tmp;
        }
    }
    
    //Agrega un nodo al final de la lista
    public void AgregarNodoFinal(Object dato)
    {
        if(PrimerNodo == null)
        {
            PrimerNodo = new NodoDoble(dato);
        }
        else
        {
            NodoDoble tmp = PrimerNodo;
            while(tmp.Siguiente!=null)
            {
                tmp = tmp.Siguiente;
            }
            NodoDoble nuevoNodo = new NodoDoble(dato);
            tmp.Siguiente = nuevoNodo;
            nuevoNodo.Anterior = tmp;
        }
    }
    
    /*
     * Agrega un dato en una posición de la lista.
     * Las posiciones se cuentan empezando en 1
    */
    public void AgregarNodoPos(Object dato, int pos)
    {
        if(pos <= 0)
        {
            System.out.println("El valor de la posición es invalido");
        }
        else
        {
            int posTmp = 1;
            NodoDoble tmp = PrimerNodo;
            NodoDoble nuevoNodo = new NodoDoble(dato);
            while(tmp!=null)
            {
                if(pos==posTmp)
                {
                    NodoDoble tmpAnterior = tmp.Anterior;
                    tmpAnterior.Siguiente = nuevoNodo;
                    nuevoNodo.Siguiente = tmp;
                    nuevoNodo.Anterior = tmpAnterior;
                    tmp.Anterior = nuevoNodo;
                }
                posTmp++;
                tmp = tmp.Siguiente;
            }
        }
    }
    //Hacer los códigos de eliminar inicio, final y pos
    public void eliminarNodoInicio(Object dato)
    {
        if(PrimerNodo == dato)
        {
            PrimerNodo = new NodoDoble(null);
        }
        else
        {
            NodoDoble tmp = new NodoDoble(null);
            tmp.Siguiente = PrimerNodo;
            PrimerNodo.Anterior = tmp;
            PrimerNodo = tmp;
        }
    }
    public void EliminarNodoFinal()
    {
        if(UltimoNodo == dato)
        {
            UltimoNodo = new NodoDoble(null);
        }
        else
        {
            NodoDoble tmp = UltimoNodo;
            while(tmp.Siguiente!=null)
            {
                tmp = tmp.Siguiente;
            }
            NodoDoble nuevoNodo = new NodoDoble(dato);
            tmp.Siguiente = nuevoNodo;
            nuevoNodo.Anterior = tmp;
        }
    }
    public boolean EliminarNodoPos(int pos)
    {
     if (PrimerNodo != null){
        if(pos == 1)
        {
            PrimerNodo = PrimerNodo.getSiguiente();
        }
        else
        {
            NodoDoble nodoAct = PrimerNodo;
            NodoDoble nodoAnt =  new NodoDoble();
            for (int currentPos =1; currentPos < pos; currentPos++){
                nodoAnt = nodoAct;
                nodoAct = nodoAct.getSiguiente();
            }
            nodoAnt.setSiguiente(nodoAct.getSiguiente());
        }
            LargoLista--;
            return true;
     }
     else {
         System.out.println("ERROR:La lista esta vacia");
         return false;
               
              
            }
        }
    }

/*
* OBSERVACIONES:
* Elimina inicio está agregando un nodo en lugar de eliminarlo
* Elimina final está agregando un nodo final vacío
* Elimina pos no está terminado
*/