/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_3;

import java.util.Scanner;

/**
 *
 * @author JorgeRicardo
 */
public class Actividad_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Se pide al usuario el largo del arreglo
        Scanner tec = new Scanner (System.in); 
        System.out.println("Introduzca el numero de elementos del arreglo ");
        int x = tec.nextInt();
        //Se instancia un objeto de la clase Secuencial para una busqueda secuencial
        Binaria os = new Binaria();
        //Se crea el arreglo
        os.setV(os.randomV(x));
        //Se muestran los valores del arreglo 
        os.showV();
        //Se pide el numero a buscar
        System.out.println("Introduzca el numero cuya posicion desea conocer: ");
        int nD = tec.nextInt();
        //Se busca el numero deseado
        int p = os.fetch(nD);
        //Se muestra posicion de ese numero
        os.showF(p);
 
    }
    
}
