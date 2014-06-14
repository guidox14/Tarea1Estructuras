/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasmagister;

/**
 *
 * @author Adrian
 */
public class ListaDobleMain
{
    public static void main(String [] args)
    {
        ListaDoble listaDoblePrueba = new ListaDoble();
        listaDoblePrueba.ImprimirListaDoble();
        listaDoblePrueba.AgregarNodoInicio("2");
        listaDoblePrueba.AgregarNodoInicio("1");
        /*listaDoblePrueba.AgregarNodoFinal("5");
        listaDoblePrueba.AgregarNodoPos("2", 2);
        listaDoblePrueba.AgregarNodoPos("4", 3);*/
        listaDoblePrueba.ImprimirListaDoble();
    }
}

/*
 * Crea un nodo doble
*/
class NodoDoble {
    public NodoDoble Siguiente;
    public NodoDoble Anterior;
    public Object Dato;
    
    //Constructor vacío
    public NodoDoble()
    {
        Siguiente = null;
        Anterior = null;
        Dato = null;
    }
    
    //Constructor que define el objecto del nodo solamente
    public NodoDoble(Object dato)
    {
        Dato = dato;
        Siguiente = null;
        Anterior = null;
    }

    //Constructor que define el objetodel nodo y el nodo siguiente
    public NodoDoble(Object dato, NodoDoble siguiente)
    {
        Siguiente = siguiente;
        Dato = dato;
        Anterior = null;
    }
}

/*
 * Clase que tiene los métodos de la lista doble
*/
class ListaDoble {
    public NodoDoble PrimerNodo;
    
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
            NodoDoble tmp = PrimerNodo;
            PrimerNodo.Dato = dato;
            PrimerNodo.Siguiente = tmp;
            PrimerNodo.Anterior = null;
            tmp.Anterior = PrimerNodo;
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
    
     @SuppressWarnings("empty-statement")
     public boolean eliminarnodoinicio(int num , Object anterior)
    {
       if ( primernodo == null);
        nodo actual=primero;
        while(actual!=ultimo)
        {
           
            if(actual.dato==num)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodo temp;
                    temp=actual.next;
                    temp.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
        if(num==ultimo.dato)
        {
            ultimo=actual.ant;
            return true;
        }
        return false;
    }
     
     public boolean eliminarNodoFinal(object nodofinal)
    {
        return this.eliminarNodoPos(this.LargoLista);
    }
     
     public boolean eliminarNodoPos(int pos)
    {
        if(this.PrimerNodo != null)
        {
            if(pos==1) // Elimina el primer Nodo
            {
                this.PrimerNodo = this.PrimerNodo.getSiguiente();
            }
            else
            {
                NodoDoble nodoAct = this.PrimerNodo;
                Nodo nodoAnt = new Nodo();
                for(int currentPos = 1; currentPos < pos; currentPos++)
                {
                    nodoAct = nodoAct.getSiguiente();
                }
                nodoAnt.setSiguiente(nodoAct.getSiguiente());
            }
            this.LargoLista--;
            return true;
        }
        else
        {
            System.out.println("ERROR: La lista esta¡ vacia");
            return false;
        }
}

    private static class object {

        public object() {
        }
}
