/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatecoderefactoring;

import duplicatecode.*;

/**
 *
 * @author Steffany
 */
public class DuplicateCodeRefactoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo1[] = {4, 2, 5, 7, 8};
        int arreglo2[] = {8, 2, 9, 5, 4,1};
        System.out.println("Promedio Arreglo 1:"+promediarArreglo(arreglo1));
        System.out.println("Promedio Arreglo 2:"+promediarArreglo(arreglo2));
    }

   

    public static int sumarArreglo(int arreglo[]) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public static int promediarArreglo(int arreglo[]) {
        return sumarArreglo(arreglo) / arreglo.length;
    }
   

}
