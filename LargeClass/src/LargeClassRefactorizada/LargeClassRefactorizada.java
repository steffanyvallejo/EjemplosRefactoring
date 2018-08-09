/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClassRefactorizada;

import largeclass.*;

/**
 *
 * @author Steffany
 */
public class LargeClassRefactorizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto texto = new Texto("Hola mundo forever", "Steffany", 15);
        Impresora p1 = new Impresora(texto);
    }
    
}
