/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatecode;

/**
 *
 * @author Steffany
 */
public class DuplicateCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo1[]= {4,2,5,7,8};
        int arreglo2[]={8,2,7,5,4,1};

        int suma1 = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            suma1 += arreglo1[i];
        }

        int promedio1 = suma1 / 5;

        int suma2 = 0;

        for (int i = 0; i < arreglo2.length; i++) {
            suma2 += arreglo2[i];
        }

        int promedio2 = suma2 / 6;
        System.out.println("Promedio Arreglo 1:" +promedio1);
        System.out.println("Promedio Arreglo 2:" +promedio2);
    }

}
