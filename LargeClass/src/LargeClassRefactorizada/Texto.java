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
public class Texto {
    private String texto;
    private String autor;
    private int longitud;

    public Texto(String texto, String autor, int longitud) {
        this.texto = texto;
        this.autor = autor;
        this.longitud = longitud;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
 
    public void covertirAMayusculas() {
    //Convertir todo texto a mayusculas...
    }
    public void covertirAMinusculas() {
    //Convertir todo texto a minusculas...
    }
    public void encontrarTextoYEliminarlo(String s) {
    // Encuentrar una subcadena y eliminarla...
    }
    public void imprimirTexto(){
        System.out.println(texto);
    }

}
