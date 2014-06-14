/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasmafernanda;

/*
 * Crea un nodo doble
 */
public class NodoDoble {

    public NodoDoble Siguiente;
    public NodoDoble Anterior;
    public Object Dato;

    //Constructor vacío
    public NodoDoble() {
        Siguiente = null;
        Anterior = null;
        Dato = null;
    }

    //Constructor que define el objecto del nodo solamente
    public NodoDoble(Object dato) {
        Dato = dato;
        Siguiente = null;
        Anterior = null;
    }

    //Constructor que define el objetodel nodo y el nodo siguiente
    public NodoDoble(Object dato, NodoDoble siguiente) {
        Siguiente = siguiente;
        Dato = dato;
        Anterior = null;
    }

    public NodoDoble getSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSiguiente(NodoDoble siguiente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
