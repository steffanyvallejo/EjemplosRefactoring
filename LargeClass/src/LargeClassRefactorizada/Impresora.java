/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClassRefactorizada;

/**
 *
 * @author Steffany
 */
public class Impresora {
     Texto texto;

    public Impresora(Texto texto) {
        this.texto = texto;
    }
     
  
    public void imprimirTexto() { 
        //Imprimir texto
        System.out.println("el texto se esta imprimiendo");
    }
}

