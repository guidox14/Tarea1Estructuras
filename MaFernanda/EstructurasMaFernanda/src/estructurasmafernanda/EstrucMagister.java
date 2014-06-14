/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasmafernanda;

/**
 *
 * @author Nanda
 */
public class EstrucMagister {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
    {
        ListaDoble listaDoblePrueba = new ListaDoble();
        //listaDoblePrueba.ImprimirListaDoble();
        listaDoblePrueba.AgregarNodoInicio("2");
        listaDoblePrueba.AgregarNodoInicio("1");
        listaDoblePrueba.AgregarNodoFinal("5");
        listaDoblePrueba.AgregarNodoPos("2", 2);
        listaDoblePrueba.AgregarNodoPos("4", 3);
        listaDoblePrueba.ImprimirListaDoble();
        /*listaDoblePrueba.eliminarNodoInicio("1");
        listaDoblePrueba.EliminarNodoFinal();*/
        listaDoblePrueba.EliminarNodoPos(2);
    }
}
